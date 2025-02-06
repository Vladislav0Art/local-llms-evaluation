package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedSplitText_invalidOffset_ThrowsIndexOutOfBoundsException {

    @Test
    public void splitText_invalidOffset_ThrowsIndexOutOfBoundsException() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        textNode.splitText(-1).text();
    }

}