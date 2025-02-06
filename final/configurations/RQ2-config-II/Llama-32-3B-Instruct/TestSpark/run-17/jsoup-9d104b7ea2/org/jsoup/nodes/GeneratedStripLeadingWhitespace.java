package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.dom.Appendable;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document.OutputSettings;

public class GeneratedStripLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace() {
        String text = "Hello,\nWorld!";
        String expectedStriped = TextNode.stripLeadingWhitespace(text);
        assertEquals(expectedStriped, TextNode.stripLeadingWhitespace(text));
    }

}