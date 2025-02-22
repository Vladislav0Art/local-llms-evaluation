package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWhenCreated_isNotBlank_TextNode {

    @Test
    public void whenCreated_isNotBlank_TextNode() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}