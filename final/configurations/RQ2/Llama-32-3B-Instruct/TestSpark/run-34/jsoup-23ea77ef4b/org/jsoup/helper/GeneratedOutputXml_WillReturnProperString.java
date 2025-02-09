package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedOutputXml_WillReturnProperString {

    @Test
    public void OutputXml_WillReturnProperString() {
        String expected = "<html><body>Hello World!</body></html>";
        Document doc = new Document();
        document.appendText(expected);
        assertNotNull(W3CDom.OutputXml());
        assertEquals(expected, W3CDom.OutputXml().toString());
    }

}