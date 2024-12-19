package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedNewTextFromEncodedMultipleCharacters {

    @Test
    public void newTextFromEncodedMultipleCharacters() {
        String encodedText = "&lt;a&gt;b&gt;</a>";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<a>b</a>", textNode.text());
    }

}