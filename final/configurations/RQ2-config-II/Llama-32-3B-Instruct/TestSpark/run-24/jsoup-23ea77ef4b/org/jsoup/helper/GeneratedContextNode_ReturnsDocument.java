package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedContextNode_ReturnsDocument {

    @Test
    public void contextNode_ReturnsDocument() {
        Document wdoc = new Document();
        Document out = W3CDom.contextNode(wdoc);
        assertEquals(wdoc, out);
    }

}