package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTestNodeName {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @After
    public void tearDown() {
        textNode = null;
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

}