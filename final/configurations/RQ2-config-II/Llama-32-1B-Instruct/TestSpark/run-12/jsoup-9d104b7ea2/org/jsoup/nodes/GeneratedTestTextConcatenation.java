package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestTextConcatenation {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testTextConcatenation() {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        String expectedResult = "Hello World";
        when(textNode.getWholeText()).thenReturn(strings.stream().collect(Collectors.joining()));
        assertEquals(expectedResult, textNode.getText());
    }

}