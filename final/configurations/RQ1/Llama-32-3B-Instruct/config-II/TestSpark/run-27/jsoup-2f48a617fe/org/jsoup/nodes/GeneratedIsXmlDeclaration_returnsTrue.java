package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_returnsTrue {

    @Test
    public void isXmlDeclaration_returnsTrue() {
        String data = "/* some data */";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}