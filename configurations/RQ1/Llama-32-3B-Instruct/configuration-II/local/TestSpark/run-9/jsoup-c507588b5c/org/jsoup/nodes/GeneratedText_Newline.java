package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedText_Newline {

    @Test
    public void text_Newline() {
        TextNode textNode = new TextNode("\n");
        assertEquals("\n", textNode.text());
    }

}