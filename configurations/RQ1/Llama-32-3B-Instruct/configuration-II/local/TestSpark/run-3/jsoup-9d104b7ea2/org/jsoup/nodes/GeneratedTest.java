package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode parentNode;

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void text() {
        TextNode node = createTextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void textBlank() {
        TextNode node = createTextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void textMultipleWhitespaces() {
        TextNode node = createTextNode("   ");
        assertEquals("   ", node.text());
    }

    @Test
    public void textTrimming() {
        String trimmedText = " Hello World  ";
        TextNode node = createTextNode(trimmedText);
        assertEquals(StringUtil.stripLeadingWhitespace(trimmedText), node.text());
    }

    @Test
    public void splitText() {
        TextNode node = createTextNode("Hello World");
        TextNode tailNode = node.splitText(5);
        assertEquals("World", tailNode.text());
    }

    @Test
    public void isBlank() {
        TextNode node = createTextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankNotBlank() {
        TextNode node = createTextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void nodeName() {
        TextNode node = createTextNode("");
        assertEquals("#text", node.nodeName());
    }

}