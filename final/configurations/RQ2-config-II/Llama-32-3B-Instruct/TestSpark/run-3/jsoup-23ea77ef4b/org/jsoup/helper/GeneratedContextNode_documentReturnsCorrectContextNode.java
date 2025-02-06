package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedContextNode_documentReturnsCorrectContextNode {

    @Test
    public void contextNode_documentReturnsCorrectContextNode() {
        Document wDoc = Mockito.mock(Document.class);
        Node expected = Mockito.mock(Node.class);
        Node result = W3CDom.contextNode(wDoc);
        assertEquals(expected, result);
    }

}