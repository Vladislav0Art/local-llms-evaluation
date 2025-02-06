package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringReturnsCorrectOutput {

    @Test
    public void ToStringReturnsCorrectOutput() {
        String expectedOutput = "<!-- comment -->\nHello World\n";
        Comment comment = new Comment("Hello World");
        assertEquals(expectedOutput, comment.toString());
    }

}