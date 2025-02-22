package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWhenTextSet_isUpdated_TextNode {

    @Test
    public void whenTextSet_isUpdated_TextNode() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertEquals("test2", textNode.text());
    }

}