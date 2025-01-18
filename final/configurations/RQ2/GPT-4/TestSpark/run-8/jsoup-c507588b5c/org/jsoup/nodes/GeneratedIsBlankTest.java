package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode.text("NotBlank");
        assertFalse(textNode.isBlank());
    }

}