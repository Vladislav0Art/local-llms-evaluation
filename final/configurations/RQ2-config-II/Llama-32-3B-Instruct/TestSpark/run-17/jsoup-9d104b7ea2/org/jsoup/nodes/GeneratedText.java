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

public class GeneratedText {

    @Test
    public void text() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}