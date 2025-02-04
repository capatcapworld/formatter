package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;

public class LineFormatterCenter extends LineFormatter {

    /**
     * Format a string with left padded spaces to become <lineLength>
     *
     * @param line       The string to format
     * @param lineLength The length of the generated string
     * @return
     */
    public String formatNextLine(String line, int lineLength) {
        StringBuilder sb = new StringBuilder(lineLength);
        sb.setLength((lineLength - line.length()) / 2);
        sb.append(line);
        sb.setLength(lineLength);
        return sb.toString().replace('\0', ' ');
    }

}
