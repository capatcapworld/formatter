package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineFormatterCenterTest {

    private LineFormatter lineFormatterCenter;

    @Before
    public void init() {
        lineFormatterCenter = new LineFormatterCenter();
    }

    @Test
    public void SplitTestWith10() {
        String inputLine = "This text should be center aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text \nshould be \n  center  \n aligned  ";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_2() {
        String inputLine = "This  text  should  be  center aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This  text\nshould  be\n  center  \n aligned  ";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_3() {
        String inputLine = "This  textparagraph  should  be  center  aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "   This   \ntextparagr\n   aph    \nshould  be\n  center  \n aligned  ";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith20() {
        String inputLine = "This text should be center aligned";
        Integer lineWidth = 20;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "This text should be \n   center aligned   ";
        assertEquals(expectedOutputLine, outputLine);
    }


    @Test
    public void SplitTestWith30() {
        String inputLine = "This text should be center aligned";
        Integer lineWidth = 30;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "  This text should be center  \n           aligned            ";
        assertEquals(expectedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith40() {
        String inputLine = "This text should be center aligned";
        Integer lineWidth = 40;
        String outputLine = lineFormatterCenter.splitLine(inputLine, lineWidth);
        String expectedOutputLine = "   This text should be center aligned   ";
        assertEquals(expectedOutputLine, outputLine);
    }

}
