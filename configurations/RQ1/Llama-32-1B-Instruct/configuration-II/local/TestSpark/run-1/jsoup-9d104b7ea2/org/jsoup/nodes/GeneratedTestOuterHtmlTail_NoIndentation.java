package org.jsoup.nodes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.AfterEach;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail_NoIndentation {

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
    public void testOuterHtmlTail_NoIndentation() {
        when(currentNode.outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class))).thenReturn("");
        TextNode result = currentNode.splitText(5);
        assertNotNull(result);
        assertEquals("", result.text());
    }

}