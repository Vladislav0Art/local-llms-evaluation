package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document wDoc = new org.jsoup.nodes.Document();

        Node node = W3CDom.contextNode(wDoc);

        assertNotNull(node);
    }

}