package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineFormatterHardTest {

    LineFormatter lineFormatterHard;

    @Before
    public void onSetup() {
        lineFormatterHard = new LineFormatterHard();
    }

    @Test
    public void SplitTestWith10() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text \nshould be \nhard align\ned";
        assertEquals(expectedOutputLine, outputLine);
    }


    @Test
    public void SplitTestWith20() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 20;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text should be \nhard aligned";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith30() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 30;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text should be hard align\ned";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith40() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 40;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text should be hard aligned";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith0() {
        String inputLine = "";
        Integer lineWidth = 10;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "          ";
        assertEquals(expectedOutputLine, outputLine);
    }

}
