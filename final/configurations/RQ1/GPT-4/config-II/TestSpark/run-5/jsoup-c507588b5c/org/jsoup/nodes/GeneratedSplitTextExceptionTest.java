package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedSplitTextExceptionTest {

    @Test
    public void splitTextExceptionTest() {
        TextNode textNode = new TextNode("Split");
        textNode.splitText(6);
    }

}