package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestIsXmlDeclarationTrueFalse {

    @Test
    public void testIsXmlDeclarationTrueFalse() {
        MockComment mock = new MockComment(true);
        assertTrue(mock.isXmlDeclaration());
        assertFalse(mock.isXmlDeclaration());
    }

}