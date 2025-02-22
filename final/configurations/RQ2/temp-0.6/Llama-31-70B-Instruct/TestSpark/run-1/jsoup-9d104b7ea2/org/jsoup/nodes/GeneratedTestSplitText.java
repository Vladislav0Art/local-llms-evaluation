package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @BeforeEach
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testSplitText() {
        textNode.text("test");
        TextNode splitText = textNode.splitText(2);
        assertEquals("te", textNode.text());
        assertEquals("st", splitText.text());
    }

}