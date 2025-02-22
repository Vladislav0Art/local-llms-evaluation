package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @After
    public void tearDown() {
        textNode = null;
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        assertEquals("Test", textNode.text());
    }

    @Test
    public void setTextTest() {
        textNode.setText("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        assertEquals("Test", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode2 = textNode.splitText(1);
        assertEquals("T", textNode.getWholeText());
        assertEquals("est", textNode2.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode textNode2 = TextNode.createFromEncoded("&lt;");
        assertEquals("<", textNode2.getWholeText());
    }

}