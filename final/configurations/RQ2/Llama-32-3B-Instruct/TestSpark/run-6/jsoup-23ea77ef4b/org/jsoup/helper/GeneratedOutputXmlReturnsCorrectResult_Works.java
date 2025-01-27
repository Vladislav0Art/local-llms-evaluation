package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedOutputXmlReturnsCorrectResult_Works {

    @Test
    public void OutputXmlReturnsCorrectResult_Works() {
        Map<String, String> properties = W3CDom.OutputXml();
        assertNotNull(properties);
        assertEquals(W3CDom.OutputHtml(), properties);
    }

}