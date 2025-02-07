package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() throws Exception {
        // Assuming stripLeadingWhitespace method is a real method of the class under test
        StringBuilder sb = new StringBuilder("   Hello World   ");
        String expectedResult = "Hello World";
        assertEquals(expectedResult, TextNode.stripLeadingWhitespace(sb.toString()));
    }

}