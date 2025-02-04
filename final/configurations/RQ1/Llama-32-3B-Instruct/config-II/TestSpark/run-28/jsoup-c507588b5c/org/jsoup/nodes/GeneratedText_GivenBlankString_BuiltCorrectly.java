package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenBlankString_BuiltCorrectly {

    @Test
    public void text_GivenBlankString_BuiltCorrectly() throws IOException {
        String blankText = "";
        TextNode textNode = TextNode.newBuilder()
                .text(blankText)
                .build();
        assertEquals("", textNode.text());
    }
}

}