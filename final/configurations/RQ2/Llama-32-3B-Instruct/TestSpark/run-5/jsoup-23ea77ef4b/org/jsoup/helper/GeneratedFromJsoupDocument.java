package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedFromJsoupDocument {

    @Test
    public void fromJsoupDocument() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.nodes.Document.toString()).thenReturn(doc.toString());
        Document result = W3CDom.fromJsoup(doc);
        assertNotNull(result);
    }

}