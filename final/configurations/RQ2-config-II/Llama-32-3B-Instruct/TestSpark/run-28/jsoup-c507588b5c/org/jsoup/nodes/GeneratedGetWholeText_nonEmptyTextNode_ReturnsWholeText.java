package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedGetWholeText_nonEmptyTextNode_ReturnsWholeText {

    @Test
    public void getWholeText_nonEmptyTextNode_ReturnsWholeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

}