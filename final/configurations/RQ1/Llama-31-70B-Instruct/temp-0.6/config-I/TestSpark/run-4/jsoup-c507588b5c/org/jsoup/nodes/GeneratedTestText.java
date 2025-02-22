package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeneratedTestText {

    private TextNode textNode;

    @BeforeEach
    void setUp() {
        textNode = new TextNode("some text");
    }

    @AfterEach
    void tearDown() {
        textNode = null;
    }

    @Test
    public void testText() {
        assertEquals("some text", textNode.text());
    }

}