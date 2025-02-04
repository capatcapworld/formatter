package com.capworld.formatter.config;

import com.capworld.formatter.exception.FormatterException;

public class Parameters {

    Alignment alignment;
    Integer width;

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public static String showHelp() {
       return "This program takes two parametes: \n\n" +
               "<parameter 1>\n" +
               "   left_align  : Left align text\n" +
               "   right_align : Right align text\n" +
               "   center      : Center align text\n" +
               "   hard        : Hard align text\n" +
               " q or quit     : quit program.\n" +
               "<parameter 2>\n" +
               "   <integer>   : The number of character on a line.";
    }

    public Parameters getParameters(String[] args) throws  FormatterException {
        this.alignment = Alignment.valueOfAlignment(args[0]);
        try {
            this.width = Integer.valueOf(args[1]);
        } catch (NumberFormatException ex) {
            throw new FormatterException("Invalid format: " + ex.getMessage());
        }
        return this;
    }
}
