package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNodeNameReturnsTextNode {

    @Test
    public void nodeNameReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.nodeName(), is("text-node"));
    }

}