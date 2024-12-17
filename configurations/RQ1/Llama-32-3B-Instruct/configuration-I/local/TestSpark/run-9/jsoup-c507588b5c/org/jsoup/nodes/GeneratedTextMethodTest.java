package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document.OutputSettings;

public class GeneratedTextMethodTest {

    @Test
    public void textMethodTest() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}