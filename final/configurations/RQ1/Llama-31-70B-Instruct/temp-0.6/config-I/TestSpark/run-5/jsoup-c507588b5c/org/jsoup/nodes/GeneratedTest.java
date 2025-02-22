package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    TextNode .class,Entities .class
})

public class TextNodeTest {

    @Test
    public void testTextNodeConstructor() {
        String text = "Test Text";
        TextNode textNode = new TextNode(text);
        assertEquals(textNode.value, text);
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Test Text");
        assertEquals(textNode.nodeName(), "#text");
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Test Text");
        assertEquals(textNode.text(), "Test Text");

        textNode = new TextNode(" Test Text ");
        assertEquals(textNode.text(), " Test Text ");
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Test Text");
        assertEquals(textNode.getWholeText(), "Test Text");

        textNode = new TextNode(" Test Text ");
        assertEquals(textNode.getWholeText(), " Test Text ");
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertEquals(textNode.isBlank(), true);

        textNode = new TextNode("Test Text");
        assertEquals(textNode.isBlank(), false);
    }

}