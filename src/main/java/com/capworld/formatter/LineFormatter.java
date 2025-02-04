package com.capworld.formatter;


import java.io.Console;

public abstract class LineFormatter {

    public void format(Integer lineLength) {
        String inputLine;
        Boolean quitInput;
        Console console = System.console();
        do {
            console.printf("Enter string to format: \n");
            String readString = console.readLine();
            quitInput = endInput(readString.trim());
            if (quitInput) {
                break;
            }
            inputLine = splitLine(readString, lineLength);
            console.printf(inputLine + "\n");
        } while (true);
    }

    public Boolean endInput(String inputLine) {
        return ("q".equalsIgnoreCase(inputLine) || "quit".equalsIgnoreCase(inputLine));
    }


    /**
     *  This function will split a line according to the length.
     *
     * @param inputLine  The line parsed
     * @param lineLength The length of the divided lines
     * @return The created string
     */
    public String splitLine(String inputLine, Integer lineLength) {
        int lastFetchedIndex = 0;
        int lastInsertedIndex = 0;
        String nextLines;
        int inputLineLength = inputLine.length();
        StringBuilder sbInputLine = new StringBuilder(inputLine.stripLeading());
        StringBuilder resultLines = new StringBuilder();

        do {
            if (lastInsertedIndex > 0) resultLines.append("\n"); // If not the first line
            nextLines = sbInputLine.substring(lastFetchedIndex);
            String nextLine = getNextLine(nextLines, lineLength);
            String formatedNextLine = formatNextLine(nextLine, lineLength);
            resultLines.append(formatedNextLine);
            int numberOfLeadingSpaces = nextLines.indexOf(nextLines.stripLeading());
            lastFetchedIndex = lastFetchedIndex + numberOfLeadingSpaces + nextLine.length();
            lastInsertedIndex = lastInsertedIndex + formatedNextLine.length() + 1;  // '\n' added
        } while (lastFetchedIndex < inputLineLength);

        return resultLines.toString();
    }

    /**
     * Calculates the next string in the document
     *
     * @param inputLine   The rest of the string to work on
     * @param lineLength  The length of  line to return
     * @return The generated line
     */
    private String getNextLine(String inputLine, int lineLength) {
        String nextLine = "";
        if (!inputLine.isEmpty()) {
            String strippedInputLine = inputLine.stripLeading();
            if (strippedInputLine.length() <= lineLength) {
                nextLine = strippedInputLine;
            } else {
                int index = strippedInputLine.lastIndexOf(" ", lineLength);
                nextLine =  (index != -1)  ? strippedInputLine.substring(0, index) : strippedInputLine.substring(0, lineLength);
            }
        }
        return nextLine.trim();
    }

    /**
     * This method must be overwritten to implement a formatting feature
     *
     * @param line        The line to format
     * @param lineLength  The length of the generated line
     * @return            The formatted line
     */
    public abstract String formatNextLine(String line, int lineLength);

}
