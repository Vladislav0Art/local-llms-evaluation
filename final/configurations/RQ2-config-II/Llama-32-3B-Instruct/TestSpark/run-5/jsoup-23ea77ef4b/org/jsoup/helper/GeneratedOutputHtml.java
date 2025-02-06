package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOutputHtml {

    @Test
    public void OutputHtml() {
        Properties expectedOutput = new Properties();
        expectedOutput.put("html", "<html>...</html>");
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertEquals(expectedOutput, output);
    }

}