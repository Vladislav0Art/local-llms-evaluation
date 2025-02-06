package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;

public class GeneratedText_NullArgument_ThrowsNullPointerException {

    @Test
    public void text_NullArgument_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

}