package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_ThrowsIOException {

    @Test
    public void outerHtmlTail_ThrowsIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("");
        try {
            node.outerHtmlTail(accum, 0, out);
            fail("Expected IOException to be thrown.");
        } catch (IOException e) {
        }
    }

}