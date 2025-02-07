package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestLastCharIsWhitespace {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testLastCharIsWhitespace() {
        List<String> strings = new ArrayList<>();
        strings.add(List.of("   ", ""));
        String expectedResult = true;
        when(textNode.lastCharIsWhitespace(any(StringBuilder.class))).thenReturn(expectedResult);
        assertEquals(true, textNode.getLastCharIsWhitespace(strings.get(0).stream().collect(Collectors.toList())));
    }

}