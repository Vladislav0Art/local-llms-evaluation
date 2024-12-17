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

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() throws IOException {
        Document document = Parser.parse("<div>test</div>");
        Element element = (Element) document.body().firstChild();
        TextNode textNode = (TextNode) element.firstChild();
        int offset = 3;
        TextNode tail = textNode.splitText(offset);
        assertEquals("te", tail.value());
    }

}