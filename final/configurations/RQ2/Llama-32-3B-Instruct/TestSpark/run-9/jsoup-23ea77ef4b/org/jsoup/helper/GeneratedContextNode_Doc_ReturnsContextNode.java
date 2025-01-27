package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedContextNode_Doc_ReturnsContextNode {

    @Test
    public void contextNode_Doc_ReturnsContextNode() {
        Document wDoc = Mockito.mock(Document.class);
        Node expected = Mockito.mock(Node.class);
        when(wDoc.getDocumentElement()).thenReturn(expected);
        Node result = W3CDom.contextNode(wDoc);
        assertEquals(expected, result);
    }

}