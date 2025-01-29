package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Document document = new Document();
        ParseSettings settings = new ParseSettings();
        settings.setDocumentMode(true);
        String expected = "<Comment>";
        Comment original = new Comment(document.toString());
        Comment cloned = original.clone();
        assertEquals(original, cloned);
    }

}