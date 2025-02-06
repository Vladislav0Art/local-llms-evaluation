package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedCloneReturnsNewTextNode {

    @Test
    public void cloneReturnsNewTextNode() throws Exception {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.clone();
        assertThat(result.text(), is(text));
    }

}