package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedOuterHtmlHeadAndTailShouldNotThrowException {

    @Test
    public void outerHtmlHeadAndTailShouldNotThrowException() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = null;
        try {
            textNode.outerHtmlHead(accum, 0, out);
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            fail("Unexpected exception");
        }
    }

}