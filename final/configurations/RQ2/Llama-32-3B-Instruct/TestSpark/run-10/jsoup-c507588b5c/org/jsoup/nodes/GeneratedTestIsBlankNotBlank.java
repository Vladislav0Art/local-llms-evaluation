package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlankNotBlank {

    public TextNode textNode = new TextNode();

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsBlankNotBlank() {
        assertTrue(textNode.isBlank("Hello World!"));
    }

}