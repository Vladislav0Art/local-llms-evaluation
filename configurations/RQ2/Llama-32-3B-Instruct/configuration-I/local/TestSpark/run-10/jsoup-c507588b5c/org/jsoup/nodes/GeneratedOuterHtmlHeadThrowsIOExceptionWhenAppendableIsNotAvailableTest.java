package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadThrowsIOExceptionWhenAppendableIsNotAvailableTest {

    @Test
    public void outerHtmlHeadThrowsIOExceptionWhenAppendableIsNotAvailableTest() {
        TextNode node = new TextNode("test");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Exception not thrown");
        } catch (IOException e) {
        }
    }

}