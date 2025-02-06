package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedCreateFromEncodedShouldCreateValidTextNode {

    @Test
    public void createFromEncodedShouldCreateValidTextNode() throws Exception {
        String encodedText = "&lt;span&gt;Hello World&lt;/span&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThat(textNode.nodeName(), is("span"));
        assertThat(textNode.text(), is("Hello World"));
    }

}