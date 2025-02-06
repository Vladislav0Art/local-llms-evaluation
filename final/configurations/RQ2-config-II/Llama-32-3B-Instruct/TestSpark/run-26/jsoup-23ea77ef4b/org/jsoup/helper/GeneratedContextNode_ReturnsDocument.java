package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.Selector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedContextNode_ReturnsDocument {

    @Test
    public void contextNode_ReturnsDocument() {
        Document doc = mock(Document.class);
        Document wDoc = W3CDom.contextNode(doc);

        assertNotNull(wDoc);
        assertTrue(wDoc.getDocumentElement() != null);
    }

}