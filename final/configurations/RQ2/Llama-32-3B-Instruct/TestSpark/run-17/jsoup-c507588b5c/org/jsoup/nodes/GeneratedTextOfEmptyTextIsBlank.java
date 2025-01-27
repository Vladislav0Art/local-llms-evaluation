package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTextOfEmptyTextIsBlank {

    @Test
    public void textOfEmptyTextIsBlank() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertEquals("", textNode.text());
    }

}