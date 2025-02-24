package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void constructorTextNodeTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void nodeNameTextNodeTest() {
        doReturn("#text").when(textNode).nodeName();
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTextNodeTest() {
        doReturn("Text").when(textNode).text();
        assertEquals("Text", textNode.text());
    }

    @Test
    public void textWithTextTextNodeTest() {
        doReturn("New Text").when(textNode).text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTextNodeTest() {
        doReturn("Whole Text").when(textNode).getWholeText();
        assertEquals("Whole Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTextNodeTest() {
        doReturn(false).when(textNode).isBlank();
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTextNodeTest() {
        doReturn(new TextNode("Split Text")).when(textNode).splitText(0);
        assertEquals("Split Text", textNode.splitText(0).text());
    }

}