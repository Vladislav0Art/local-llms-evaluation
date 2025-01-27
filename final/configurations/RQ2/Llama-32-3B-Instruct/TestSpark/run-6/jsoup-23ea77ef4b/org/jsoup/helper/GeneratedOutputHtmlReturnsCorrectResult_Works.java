package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedOutputHtmlReturnsCorrectResult_Works {

    @Test
    public void OutputHtmlReturnsCorrectResult_Works() {
        Map<String, String> properties = W3CDom.OutputHtml();
        assertNotNull(properties);
        assertEquals(W3CDom.OutputXml(), properties);
    }

}