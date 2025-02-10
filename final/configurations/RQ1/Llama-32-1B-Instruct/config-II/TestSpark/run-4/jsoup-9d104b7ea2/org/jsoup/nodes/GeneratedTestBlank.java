package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestBlank {

    @Test
    public void testBlank() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

}