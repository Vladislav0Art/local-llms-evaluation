package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Mock
    private Element element;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        textNode = new TextNode("text");
    }

    @Test
    public void testOuterHtmlHead() {
        when(element.shouldIndent(null)).thenReturn(true);
        when(element.isBlock()).thenReturn(true);
        when(element.formatAsBlock()).thenReturn(true);
        textNode.parentNode(element);
        textNode.siblingIndex = 0;
        textNode.outerHtmlHead(null, 1, null);
    }

}