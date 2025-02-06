package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedContextNode_doc {

    @Test
    public void contextNode_doc() {
        Document wDoc = new Document();
        Node node = W3CDom.contextNode(wDoc);
        assertNotNull(node);
    }

}