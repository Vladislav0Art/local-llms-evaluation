package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.setDocumentMode(true);
        String expected = "<Comment>";
        Comment comment = new Comment(document.toString());
        comment.outerHtmlTail(settings, 0, null).join();
    }

}