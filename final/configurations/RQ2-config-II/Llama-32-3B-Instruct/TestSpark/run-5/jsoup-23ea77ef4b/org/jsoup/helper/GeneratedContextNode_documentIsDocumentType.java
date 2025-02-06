package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedContextNode_documentIsDocumentType {

    @Test
    public void contextNode_documentIsDocumentType() {
        Document doc = new org.w3c.dom.Document();
        Node context = W3CDom.contextNode(doc);
        assertEquals(doc, context);
    }

}