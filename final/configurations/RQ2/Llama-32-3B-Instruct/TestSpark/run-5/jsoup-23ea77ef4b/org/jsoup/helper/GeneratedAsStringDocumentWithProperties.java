package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAsStringDocumentWithProperties {

    @Test
    public void asStringDocumentWithProperties() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.helper.W3CDom.fromString(doc)).thenReturn(doc);
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

}