package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() throws Exception {
        // Assuming normaliseWhitespace method is a real method of the class under test
        String text = "   Hello World   ";
        String expectedResult = "Hello World";
        assertEquals(expectedResult, TextNode.normaliseWhitespace(text));
    }

}