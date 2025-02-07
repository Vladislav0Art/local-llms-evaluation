package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCreateFromEncoded {

    private TextNode rootNode;

    @Test
    public void testCreateFromEncoded() {
        rootNode = new TextNode(createFromEncoded("Hello World"));
        assertNotNull(rootNode);
    }

}