package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedGetWholeTextReturnsConcatenatedText {

    @Test
    public void getWholeTextReturnsConcatenatedText() {
        String text1 = "Hello ";
        String text2 = "World";
        TextNode textNode1 = new TextNode(text1);
        TextNode textNode2 = new TextNode(text2);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable accum = output;
        try {
            Document.OutputSettings out = null;
            textNode1.outerHtmlHead(accum, 0, out);
            textNode2.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            fail("Unexpected exception");
        }
        assertThat(output.toString().trim(), is(text1 + text2));
    }

}