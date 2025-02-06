package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedTextSetAndGetText {

    @Test
    public void textSetAndGetText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode.text("New Text");
        assertThat(textNode.text(), is("New Text"));
    }

}