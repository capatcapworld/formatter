package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineFormatterRightAlignTest {

    LineFormatter lineFormatterRightAlign;

    @Before
    public void init() {
        lineFormatterRightAlign = new LineFormatterRightAlign();
    }

    @Test
    public void SplitTestWith10() {
        String inputLine = "This text should be right aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterRightAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = " This text\n should be\n     right\n   aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_2() {
        String inputLine = "This  text  should  be  right  aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterRightAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This  text\nshould  be\n     right\n   aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_3() {
        String inputLine = "This  textparagraph  should  be  right  aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterRightAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "      This\ntextparagr\n       aph\nshould  be\n     right\n   aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith20() {
        String inputLine = "This text should be right aligned";
        Integer lineWidth = 20;
        String outputLine = lineFormatterRightAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = " This text should be\n       right aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith30() {
        String inputLine = "This text should be right aligned";
        Integer lineWidth = 30;
        String outputLine = lineFormatterRightAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "     This text should be right\n                       aligned";
        assertEquals(expecedOutputLine, outputLine);
    }

}
