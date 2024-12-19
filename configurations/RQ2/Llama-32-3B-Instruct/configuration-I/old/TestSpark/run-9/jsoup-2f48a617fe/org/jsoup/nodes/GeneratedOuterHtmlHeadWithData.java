package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadWithData {

    @Test
    public void outerHtmlHeadWithData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document doc = new Document(outContent);
        Appendable accum = new StringBuilder();
        depth(0, doc, accum, 1, "Hello World");
        Comment comment = (Comment) accum.toString().trim();
        assertTrue(comment.isXmlDeclaration());
    }

}