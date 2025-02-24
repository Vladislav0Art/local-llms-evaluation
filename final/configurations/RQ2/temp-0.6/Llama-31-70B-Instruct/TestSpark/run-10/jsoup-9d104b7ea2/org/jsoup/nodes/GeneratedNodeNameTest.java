package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        // Given
        String text = "test";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals("#text", textNode.nodeName());
    }

}