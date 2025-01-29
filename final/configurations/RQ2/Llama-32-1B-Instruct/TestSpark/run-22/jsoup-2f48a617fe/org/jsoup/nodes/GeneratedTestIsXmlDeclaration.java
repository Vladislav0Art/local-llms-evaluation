package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("<!DOCTYPE html><body>Hello World!</body></html>");
        assertTrue(comment.isXmlDeclaration());
    }

}