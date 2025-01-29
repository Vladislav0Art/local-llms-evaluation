package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestJoin {

    @Test
    public void testJoin() {
        Document document = new Document();
        Comment comment1 = new Comment(document.toString());
        Comment comment2 = new Comment(document.toString());

        String expected = "<Comment>";
        assertEquals(expected, comment1.outerHtmlHead(parserSettings, 0, null).join());
        assertEquals(expected, comment2.outerHtmlTail(parserSettings, 0, null).join());
    }

}