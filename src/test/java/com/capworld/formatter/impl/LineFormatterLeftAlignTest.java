package com.capworld.formatter.impl;

import com.capworld.formatter.LineFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineFormatterLeftAlignTest {

    LineFormatter lineFormatterLeftAlign;

    @Before
    public void init() {
        lineFormatterLeftAlign = new LineFormatterLeftAlign();
    }

    @Test
    public void SplitTestWith10() {
        String inputLine = "This text should be left aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text \nshould be \nleft      \naligned   ";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_2() {
        String inputLine = "This  text  should  be  left  aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This  text\nshould  be\nleft      \naligned   ";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith10_3() {
        String inputLine = "This  textparagraph  should  be  left  aligned";
        Integer lineWidth = 10;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This      \ntextparagr\naph       \nshould  be\nleft      \naligned   ";
        assertEquals(expecedOutputLine, outputLine);
    }


    @Test
    public void SplitTestWith20() {
        String inputLine = "This text should be left aligned";
        Integer lineWidth = 20;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be \nleft aligned        ";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith30() {
        String inputLine = "This text should be left aligned";
        Integer lineWidth = 30;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be left      \naligned                       ";
        assertEquals(expecedOutputLine, outputLine);
    }

    @Test
    public void SplitTestWith40() {
        String inputLine = "This text should be left aligned";
        Integer lineWidth = 40;
        String outputLine = lineFormatterLeftAlign.splitLine(inputLine, lineWidth);
        String expecedOutputLine = "This text should be left aligned        ";
        assertEquals(expecedOutputLine, outputLine);
    }

}
