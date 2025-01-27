package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Text;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText TextNodeSplitTextTest {

    @Test
    public void splitText

    TextNodeSplitTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals(0, textNode.splitText(0));
        assertEquals(6, textNode.splitText(1));
        assertEquals(5, textNode.splitText(7));
    }

}