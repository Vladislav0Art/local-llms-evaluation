package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTextSetsWholeText {

    @Test
    public void textSetsWholeText() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode("");
        node.text(text);
        assertEquals(text, node.getWholeText());
    }

}