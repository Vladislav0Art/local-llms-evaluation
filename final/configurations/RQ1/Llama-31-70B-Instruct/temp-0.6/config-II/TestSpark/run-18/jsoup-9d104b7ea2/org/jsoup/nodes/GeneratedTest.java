package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void shouldReturnNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void shouldReturnText() {
        assertEquals("", textNode.text());
    }

    @Test
    public void shouldSetText() {
        textNode.text("Test");
        assertEquals("Test", textNode.text());
    }

    @Test
    public void shouldReturnWholeText() {
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void shouldBeBlank() {
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void shouldSplitText() {
        TextNode newNode = textNode.splitText(0);
        assertEquals("", newNode.text());
    }

    @Test
    public void shouldReturnTailNode() {
        TextNode newNode = textNode.splitText(0);
        assertEquals("", newNode.text());
    }

}