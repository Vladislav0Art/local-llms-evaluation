package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestToString {

    public static void testNodeName() {
        String expected = "Comment";
        Element comment = new Comment().outerHtmlHead(parserSettings, 0, null).join();
        assertEquals(expected, comment.toString());
    }

    @Test
    public void testToString() {
        Element comment = new Comment("This is a test").toString();
        assertEquals("This is a test", comment);
    }

}