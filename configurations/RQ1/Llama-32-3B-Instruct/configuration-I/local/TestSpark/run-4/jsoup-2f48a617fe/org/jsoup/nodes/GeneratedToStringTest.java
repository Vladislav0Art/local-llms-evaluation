package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("Hello World");
        comment.outerHtml(accum, 0, out);
        accum.toString().equals("<!--Hello World-->");
    }

}