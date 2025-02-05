package com.capworld.formatter.impl;


import com.capworld.formatter.LineFormatter;

public class LineFormatterHard extends LineFormatter {

    /**
     * This methode will just return the line as entered.
     * The line is split at the line length.
     *
     * @param inputLine The line to parse
     * @param lineLength Line length of wrapped lines
     * @return the formatted string with same line length
     */
    public String splitLine(String inputLine, Integer lineLength) {
        int inputLineLength = inputLine.length();
        StringBuilder sbInputLine = new StringBuilder(inputLine);
        if (sbInputLine.isEmpty()) return " ".repeat(lineLength);
        for (int i = lineLength;i < inputLineLength; i = i+lineLength+1) {
            sbInputLine.insert(i,"\n");
            inputLineLength++;
        }
        return sbInputLine.toString();
    }


    /**
     * Format a string with left padded spaces to become <lineLength>
     *
     * @param line           The string to format
     * @param lineLength     The length of the generated string
     * @return               Dummy string is returned
     */
    public String formatNextLine(String line, int lineLength) {
        return "dummy";
    }

}
