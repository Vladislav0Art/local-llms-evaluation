package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWhenCreated_valueIsSet_TextNode {

    @Test
    public void whenCreated_valueIsSet_TextNode() {
        String value = "test";
        TextNode textNode = new TextNode(value);
        assertEquals(value, textNode.coreValue());
    }

}