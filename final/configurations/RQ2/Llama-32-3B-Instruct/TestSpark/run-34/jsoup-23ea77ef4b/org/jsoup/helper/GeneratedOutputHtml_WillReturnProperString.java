package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedOutputHtml_WillReturnProperString {

    @Test
    public void OutputHtml_WillReturnProperString() {
        String expected = "<html><body>Hello World!</body></html>";
        Document doc = new Document();
        document.appendText(expected);
        assertNotNull(W3CDom.OutputHtml());
        assertEquals(expected, W3CDom.OutputHtml().toString());
    }

}