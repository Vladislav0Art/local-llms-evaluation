package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedContextNode_FromDocumentTest {

    @Test
    public void contextNode_FromDocumentTest() {
        Document wDoc = new Document();
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

}