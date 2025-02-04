package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewTextNode_BuiltCorrectly {

    @Test
    public void newTextNode_BuiltCorrectly() throws IOException {
        String text = "test";
        TextNode textNode = TextNode.newBuilder()
                .text(text)
                .build();
        assertEquals(text, textNode.text());
    }

}