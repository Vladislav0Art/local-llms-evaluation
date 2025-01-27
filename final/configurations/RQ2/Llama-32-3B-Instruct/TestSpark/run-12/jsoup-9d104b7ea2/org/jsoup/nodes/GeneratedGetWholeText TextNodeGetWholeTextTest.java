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

public class GeneratedGetWholeText TextNodeGetWholeTextTest {

    @Test
    public void getWholeText

    TextNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.getWholeText());
    }

}