package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadThrowsExceptionWhenAppendableIsNotAvailableTest {

    @Test
    public void outerHtmlHeadThrowsExceptionWhenAppendableIsNotAvailableTest() {
        TextNode node = new TextNode("test");
        Appendable accum = null;
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Exception not thrown");
        } catch (Exception e) {
        }
    }

}