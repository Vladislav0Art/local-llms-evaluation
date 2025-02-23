package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.After;

public class GeneratedTest {

    private TextNode node;
    private String text = "This is a test";
    private String encodedText = "&lt;This is a test&gt;";

    @Before
    public void setUp() {
        node = new TextNode(text);
    }

    @After
    public void tearDown() {
        node = null;
    }

    @Test
    public void textNodeConstructorTest() {
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        assertEquals(StringUtil.normaliseWhitespace(text), node.text());
    }

    @Test
    public void getWholeTextTest() {
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        assertTrue(new TextNode("").isBlank());
        assertTrue(new TextNode(" ").isBlank());
        assertTrue(new TextNode("\n").isBlank());
        assertTrue(new TextNode("\t").isBlank());
        assertTrue(new TextNode("    ").isBlank());
        assertTrue(new TextNode(" \t \n").isBlank());
    }

}