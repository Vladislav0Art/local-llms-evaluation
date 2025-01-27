package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBlankMethod {

    public TextNode textNode = new TextNode();

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBlankMethod() {
        when(textNode.isBlank()).thenReturn(true);
        assertTrue(textNode.isBlank());
    }

}