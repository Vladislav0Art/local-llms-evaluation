package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedSplitTextSplitAtGivenOffset {

    @Test
    public void splitTextSplitAtGivenOffset() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result1 = textNode.splitText(6);
        TextNode expected1 = new TextNode("World");
        assertThat(result1.text(), is(expected1.text()));
        TextNode result2 = textNode.splitText(12);
        TextNode expected2 = new TextNode("!");
    }

}