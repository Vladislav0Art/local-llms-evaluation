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

public class GeneratedText_EmptyText_ReturnsEmptyString {

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertThat(textNode.text(), is(""));
    }

}