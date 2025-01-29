package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTest setData {

    public static void testNodeName() {
        String expected = "Comment";
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        assertEquals(expected, comment.toString());
    }

    @Test
    public void test

    setData() {
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        comment.outerHtmlHead(parserSettings, 0, null).setData("");
        String expected = "This is a test";
        assertEquals(expected, comment.toString());
    }

}