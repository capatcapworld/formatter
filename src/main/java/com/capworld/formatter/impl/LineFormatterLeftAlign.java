package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;

public class LineFormatterLeftAlign extends LineFormatter {

    /**
     * Format a string with left padded spaces to become <lineLength>
     *
     * @param line           The string to format
     * @param lineLength     The length of the generated string
     * @return               The formatted line
     */
    public String formatNextLine(String line, int lineLength) {
        return String.format("%-" + lineLength + "s", line, ' ');
    }

}
