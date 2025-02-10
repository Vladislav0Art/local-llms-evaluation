package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTestOuterHtmlTail {

    private TextNode node;

    @Before
    public void setup() {
        Random random = new Random();
        node = new TextNode(StringUtil.randomString(10, 100));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String text = "   Hello World!";
        node.setText(text);
        Document document = createDocument();
        Appendable appender = new StringBuilder();
        document.outerHtml(appender, 1, null);
        assertEquals("Hello World!", appender.toString());
    }

}