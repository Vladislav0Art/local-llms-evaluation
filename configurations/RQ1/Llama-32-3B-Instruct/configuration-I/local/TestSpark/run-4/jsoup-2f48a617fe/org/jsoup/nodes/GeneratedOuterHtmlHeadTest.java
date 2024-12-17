package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Document doc = new Document();
        Element node = new Element("node");
        Comment comment = new Comment(node);
        comment.outerHtmlHead(accum, 0, out);
        accum.toString().equals("<!--Hello World-->");
    }

}