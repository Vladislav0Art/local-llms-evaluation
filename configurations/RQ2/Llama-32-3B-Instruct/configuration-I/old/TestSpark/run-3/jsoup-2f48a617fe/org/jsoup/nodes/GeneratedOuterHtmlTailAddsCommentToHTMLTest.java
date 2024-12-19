package org.jsoup.nodes;

import org.jsoup.Document;
import org.jsoup.nodes.Document.Builder;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedOuterHtmlTailAddsCommentToHTMLTest {

    @Test
    public void outerHtmlTailAddsCommentToHTMLTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        AtomicInteger count = new AtomicInteger(0);
        Document.OutputSettings settings = new Document.OutputSettings();

        Comment comment = new Comment("data");
        comment.outerHtmlTail(new StringBuilder(), 1, settings);

        assertEquals(count.get(), 1);
    }

}