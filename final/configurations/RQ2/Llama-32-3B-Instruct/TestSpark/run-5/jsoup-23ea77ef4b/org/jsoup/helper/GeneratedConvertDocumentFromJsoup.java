package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedConvertDocumentFromJsoup {

    @Test
    public void convertDocumentFromJsoup() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.helper.W3CDom.convert(doc)).thenReturn(doc);
        Document result = W3CDom.convert(doc);
        assertNotNull(result);
    }

}