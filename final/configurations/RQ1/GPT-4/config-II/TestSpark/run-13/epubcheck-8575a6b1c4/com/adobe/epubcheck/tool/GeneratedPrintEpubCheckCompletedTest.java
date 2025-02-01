package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPrintEpubCheckCompletedTest {

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void printEpubCheckCompletedTest() {
        Report report = new CheckingReport(new PrintWriter(System.out, true), "testPath");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        epubChecker.printEpubCheckCompleted(report);
        assertNotEquals("", outContent.toString());
        System.setOut(System.out);
    }

}