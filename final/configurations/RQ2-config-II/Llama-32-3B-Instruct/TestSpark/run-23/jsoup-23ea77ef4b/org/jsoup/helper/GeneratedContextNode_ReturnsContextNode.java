package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNode_ReturnsContextNode {

    @Test
    public void contextNode_ReturnsContextNode() {
        Document wDoc = new Document();
        Node contextNode = W3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

}