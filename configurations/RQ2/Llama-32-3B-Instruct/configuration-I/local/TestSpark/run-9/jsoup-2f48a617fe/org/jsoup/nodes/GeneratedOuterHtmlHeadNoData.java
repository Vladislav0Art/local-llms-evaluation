package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadNoData {

    @Test
    public void outerHtmlHeadNoData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document doc = new Document(outContent);
        Appendable accum = new StringBuilder();
        depth(0, doc, accum, 1, null);
        Comment comment = (Comment) accum.toString().trim();
        assertTrue(comment.isXmlDeclaration());
    }

}