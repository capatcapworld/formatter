package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineFormatterHardTest {

    LineFormatter lineFormatterHard;

    @Before
    public void init() {
        lineFormatterHard = new LineFormatterHard();
    }

    @Test
    public void SplitTestWith10() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text \nshould be \nhard align\ned";
        assertEquals(expecedOutputLine, outputLine);
    }


    @Test
    public void SplitTestWith20() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 20;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be \nhard aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith30() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 30;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be hard align\ned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith40() {
        String inputLine = "This text should be hard aligned";
        Integer lineWidth = 40;
        String outputLine = lineFormatterHard.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be hard aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

}
