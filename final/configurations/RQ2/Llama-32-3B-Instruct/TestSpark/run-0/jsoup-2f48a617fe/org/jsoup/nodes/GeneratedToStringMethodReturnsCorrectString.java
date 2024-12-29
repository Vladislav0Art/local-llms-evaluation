package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringMethodReturnsCorrectString {

    @Test
    public void toStringMethodReturnsCorrectString() {
        Comment node = new Comment("This is a comment");
        String str = node.toString();
        assertTrue(str.contains("<!--"));
        assertTrue(str.endsWith("-->"));
    }

}