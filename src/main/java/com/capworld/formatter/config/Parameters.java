package com.capworld.formatter.config;

import com.capworld.formatter.exception.FormatterException;

public class Parameters {

    Alignment alignment;
    Integer width;

    public Alignment getAlignment() {
        return alignment;
    }

    public Integer getWidth() {
        return width;
    }

    public static String showHelp() {
        return """
                This program takes two parameters:\s
                
                <parameter 1>
                   left_align  : Left align text
                   right_align : Right align text
                   center      : Center align text
                   hard        : Hard align text
                 q or quit     : quit program.
                <parameter 2>
                   <integer>   : The number of character on a line.
                
                """;
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
