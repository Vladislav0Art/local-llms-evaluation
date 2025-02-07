package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestClone {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();
        assertEquals(textNode, clone);
    }

}