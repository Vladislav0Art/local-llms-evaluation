package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOutputXml {

    @Test
    public void OutputXml() {
        Properties expectedOutput = new Properties();
        expectedOutput.put("xml", "<xml>...</xml>");
        HashMap<String, String> output = W3CDom.OutputXml();
        assertEquals(expectedOutput, output);
    }

}