package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestStripLeadingWhitespace {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testStripLeadingWhitespace() {
        List<String> strings = new ArrayList<>();
        strings.add(List.of("   ", "Hello"));
        String expectedResult = "Hello";
        when(textNode.stripLeadingWhitespace(any(StringBuilder.class))).thenReturn(expectedResult);
        assertEquals(expectedResult, textNode.getWholeText());
    }

}