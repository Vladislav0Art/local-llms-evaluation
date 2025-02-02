package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.TextPosition;
import org.jsoup.nodes.ValueNode;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class Generated[TextNodeSplitTextTest]

TestCannotSplitAtOffsetGreaterThenTextLength {

    private TextNode textNode;
    private Document document;
    private Element element;

    @Before
    public void setup () {
        document = new Document();
        element = document.createElement("div");
        when(element.tagName()).thenReturn("div");
        document.appendChild(element);
    }

    @After
    public void tearDown () {
        // No-op
    }

    @Test
    public void [TextNodeSplitTextTest]TestCannotSplitAtOffsetGreaterThenTextLength() {
        textNode = new TextNode("Hello World");
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(13));
    }

}