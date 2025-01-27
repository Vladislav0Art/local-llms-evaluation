package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedContextNodeDocument {

    @Test
    public void contextNodeDocument() {
        Document doc = new org.jsoup.nodes.Document();
        when(org.jsoup.nodes.Document.getOwnerElement()).thenReturn(doc);
        Node result = W3CDom.contextNode(null);
        assertNotNull(result);
    }

}