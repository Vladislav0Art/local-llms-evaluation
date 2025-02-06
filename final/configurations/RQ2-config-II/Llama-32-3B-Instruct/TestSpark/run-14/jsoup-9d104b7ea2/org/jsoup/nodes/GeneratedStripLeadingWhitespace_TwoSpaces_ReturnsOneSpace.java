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

public class GeneratedStripLeadingWhitespace_TwoSpaces_ReturnsOneSpace {

    @Test
    public void stripLeadingWhitespace_TwoSpaces_ReturnsOneSpace() {
        String originalText = "  ";
        String expectedText = " ";
        assertThat(TextNode.stripLeadingWhitespace(originalText), is(expectedText));
    }

}