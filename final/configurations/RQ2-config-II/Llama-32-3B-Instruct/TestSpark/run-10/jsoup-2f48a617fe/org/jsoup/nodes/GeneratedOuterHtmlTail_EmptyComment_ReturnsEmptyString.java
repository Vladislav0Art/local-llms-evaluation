package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_EmptyComment_ReturnsEmptyString {

    @Test
    public void outerHtmlTail_EmptyComment_ReturnsEmptyString() {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document(out).outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}