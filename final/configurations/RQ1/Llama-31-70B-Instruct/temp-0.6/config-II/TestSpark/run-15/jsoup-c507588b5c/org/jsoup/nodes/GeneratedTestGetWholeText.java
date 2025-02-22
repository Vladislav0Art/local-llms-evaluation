package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestGetWholeText {

    private TextNode textNode;

    @Mock
    private Element element;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        textNode = new TextNode("text");
    }

    @Test
    public void testGetWholeText() {
        assertEquals("text", textNode.getWholeText());
    }

}