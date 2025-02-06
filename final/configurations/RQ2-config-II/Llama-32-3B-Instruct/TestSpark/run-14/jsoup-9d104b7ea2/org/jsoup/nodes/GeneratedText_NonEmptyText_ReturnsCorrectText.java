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

public class GeneratedText_NonEmptyText_ReturnsCorrectText {

    @Test
    public void text_NonEmptyText_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello");
        assertThat(textNode.text(), is("Hello"));
    }

}