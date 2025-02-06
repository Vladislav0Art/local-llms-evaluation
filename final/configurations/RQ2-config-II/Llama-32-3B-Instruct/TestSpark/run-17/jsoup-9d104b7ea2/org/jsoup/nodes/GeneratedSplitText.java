package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.dom.Appendable;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document.OutputSettings;

public class GeneratedSplitText {

    @Test
    public void splitText() throws IOException {
        TextNode node = new TextNode("Hello, World!");
        int offset = 7;
        TextNode newNode = node.splitText(offset);
        assertNotNull(newNode);
        assertEquals("World!", newNode.text());
    }

}