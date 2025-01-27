package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedOutputXmlReturnsEmptyMap {

    @Test
    public void OutputXmlReturnsEmptyMap() {
        Map<String, String> result = W3CDom.OutputXml();
        assertTrue(result.isEmpty());
    }

}