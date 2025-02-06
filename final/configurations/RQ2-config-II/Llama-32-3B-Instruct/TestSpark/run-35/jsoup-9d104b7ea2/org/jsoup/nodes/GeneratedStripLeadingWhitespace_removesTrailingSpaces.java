package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedStripLeadingWhitespace_removesTrailingSpaces {

    @Test
    public void stripLeadingWhitespace_removesTrailingSpaces() {
        String text = "   Hello World!";
        assertEquals("Hello World!", TextNode.stripLeadingWhitespace(text));
    }

}