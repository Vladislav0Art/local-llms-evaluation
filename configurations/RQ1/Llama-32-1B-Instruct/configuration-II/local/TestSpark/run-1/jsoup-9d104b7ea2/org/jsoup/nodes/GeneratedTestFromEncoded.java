package org.jsoup.nodes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestFromEncoded {

    private TextNode currentNode;
    private Document document;

    @Before
    public void setup() {
        document = Mockito.mock(Document.class);
        currentNode = new TextNode("  Hello World");
    }

    @After
    public void tearDown() {
        document = null;
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "Hello World";
        when(currentNode.createFromEncoded(encodedText)).thenReturn(new TextNode("Hello World"));
        TextNode text = currentNode.clone();
        assertNotNull(text);
        assertEquals(encodedText, text.text().trim());
    }

}