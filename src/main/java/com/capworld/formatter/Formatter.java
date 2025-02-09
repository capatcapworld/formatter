package com.capworld.formatter;

import com.capworld.formatter.domain.Alignment;
import com.capworld.formatter.exception.FormatterException;
import com.capworld.formatter.impl.LineFormatterCenter;
import com.capworld.formatter.impl.LineFormatterHard;
import com.capworld.formatter.impl.LineFormatterLeftAlign;
import com.capworld.formatter.impl.LineFormatterRightAlign;

public class Formatter {
    public static void main(String[] args) {
        try {
            new Formatter().doFormat(args);
        } catch (FormatterException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void doFormat(String[] args) throws FormatterException {
        if (args.length != 2 ||
                "help".equalsIgnoreCase(args[0]) ||
                "?".equals(args[0]))  {
            System.out.println(Parameters.showHelp());
            return;
        }
        Parameters parameters = new Parameters().getParameters(args);
        System.out.println("param 0 : " + parameters.getAlignment());
        System.out.println("param 1 : " + parameters.getWidth());

        Integer width = parameters.getWidth();
        switch (parameters.getAlignment()) {
            case Alignment.RIGHT_ALIGN : new LineFormatterRightAlign().format(width); break;
            case Alignment.LEFT_ALIGN : new LineFormatterLeftAlign().format(width); break;
            case Alignment.CENTER : new LineFormatterCenter().format(width); break;
            case Alignment.HARD: new LineFormatterHard().format(width); break;
            case Alignment.UNKNOWN:
            default : System.out.println(Parameters.showHelp()); break;
        }

    }
}