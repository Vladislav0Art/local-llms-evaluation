package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOuterHtmlHeadMethodTest {

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        Comment comment = new Comment("test");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(outContent.toString().contains("<!--"));
    }

}