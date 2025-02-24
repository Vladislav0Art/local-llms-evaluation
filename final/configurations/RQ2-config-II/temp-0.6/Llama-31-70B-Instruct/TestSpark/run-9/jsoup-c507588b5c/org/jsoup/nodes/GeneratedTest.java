package org.jsoup.nodes;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeConstructorTest() {
        when(textNode.nodeName()).thenReturn("TextNode");
        assertEquals("TextNode", textNode.nodeName());
    }

    @Test
    public void textTest() {
        when(textNode.text()).thenReturn("This is a text");
        assertEquals("This is a text", textNode.text());
    }

    @Test
    public void textSetterTest() {
        when(textNode.text("This is a text")).thenReturn(textNode);
        assertEquals(textNode, textNode.text("This is a text"));
    }

    @Test
    public void getWholeTextTest() {
        when(textNode.getWholeText()).thenReturn("This is a whole text");
        assertEquals("This is a whole text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        when(textNode.isBlank()).thenReturn(true);
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        when(textNode.splitText(1)).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(1));
    }

    @Test
    public void toStringTest() {
        when(textNode.toString()).thenReturn("TextNode");
        assertEquals("TextNode", textNode.toString());
    }

}