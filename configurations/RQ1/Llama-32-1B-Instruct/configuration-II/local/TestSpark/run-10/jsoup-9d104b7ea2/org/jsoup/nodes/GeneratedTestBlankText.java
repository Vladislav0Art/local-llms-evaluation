package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        TextNode text = new TextNode("");
        assertTrue(text.isBlank());
    }

}