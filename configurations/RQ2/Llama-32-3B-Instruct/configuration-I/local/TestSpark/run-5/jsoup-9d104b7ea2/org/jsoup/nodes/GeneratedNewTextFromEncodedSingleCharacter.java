package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNewTextFromEncodedSingleCharacter {

    @Test
    public void newTextFromEncodedSingleCharacter() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }

}