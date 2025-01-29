package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.setDocumentMode(true);
        String expected = "<Comment>";
        Comment comment = new Comment(document.toString());
        comment.outerHtmlHead(settings, 0, null).join();
    }

}