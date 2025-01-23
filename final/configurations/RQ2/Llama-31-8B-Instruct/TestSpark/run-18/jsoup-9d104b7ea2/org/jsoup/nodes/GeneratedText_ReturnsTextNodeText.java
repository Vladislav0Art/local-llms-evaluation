package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_ReturnsTextNodeText {

    @Test
    public void text_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

}