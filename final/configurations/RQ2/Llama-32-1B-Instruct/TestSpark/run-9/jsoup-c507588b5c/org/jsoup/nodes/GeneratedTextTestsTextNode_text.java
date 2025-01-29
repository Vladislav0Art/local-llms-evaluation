package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedTextTestsTextNode_text {

    @Test
    public void textTestsTextNode_text() {
        String text = "";
        TestNode node = new TestNode("");
        when(node.text()).thenReturn(text);
        assertEquals(text, node.text());
    }

}