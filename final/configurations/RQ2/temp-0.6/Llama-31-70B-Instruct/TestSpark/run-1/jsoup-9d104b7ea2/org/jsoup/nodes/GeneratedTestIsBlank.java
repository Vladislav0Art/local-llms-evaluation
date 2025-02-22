package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @BeforeEach
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testIsBlank() {
        assertTrue(textNode.isBlank());
        textNode.text("test");
        assertFalse(textNode.isBlank());
    }

}