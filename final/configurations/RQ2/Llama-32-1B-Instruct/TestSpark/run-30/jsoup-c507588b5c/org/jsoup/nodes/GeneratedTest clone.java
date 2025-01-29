package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest clone {

    @Test
    public void test

    clone() {
        String text = "Hello";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(0, 100);
        TextNode createFromEncoded
        ("text/" + text).outerHtmlHead(accum, 1, out).outerHtmlTail(out.accumulate()).clone().trim();

        // Verify the clone is not empty
        assertTrue(accum.length() == 102);

        // Verifying the cloned node's properties
        assertEquals(text, TextNode.class.getMethod("text").invoke(createFromEncoded("text/" + text)).trim());
    }

}