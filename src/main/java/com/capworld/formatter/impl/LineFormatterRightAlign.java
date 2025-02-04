package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;

public class LineFormatterRightAlign  extends LineFormatter {

    /**
     * Format a string with left padded spaces to become <lineLength>
     *
     * @param line           The string to format
     * @param lineLength     The length of the generated string
     * @return
     */
    public String formatNextLine(String line, int lineLength) {
        return String.format("%" + lineLength + "s", line, ' ');
    }

}
