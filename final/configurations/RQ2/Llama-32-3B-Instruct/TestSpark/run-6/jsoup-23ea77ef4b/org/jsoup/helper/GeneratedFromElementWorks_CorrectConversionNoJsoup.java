package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromElementWorks_CorrectConversionNoJsoup {

    @Test
    public void fromElementWorks_CorrectConversionNoJsoup() throws Exception {
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("html", "", "");
        Document doc = W3CDom.fromJsoup(element);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}