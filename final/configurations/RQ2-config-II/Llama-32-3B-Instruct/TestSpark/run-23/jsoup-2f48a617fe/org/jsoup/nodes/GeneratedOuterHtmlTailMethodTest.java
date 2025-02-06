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

public class GeneratedOuterHtmlTailMethodTest {

    @Test
    public void outerHtmlTailMethodTest() {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(accum.toString().contains("-->"));
    }

}