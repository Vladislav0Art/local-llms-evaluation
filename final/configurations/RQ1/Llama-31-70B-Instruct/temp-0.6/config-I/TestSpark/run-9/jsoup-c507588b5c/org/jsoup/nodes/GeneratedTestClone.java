package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTestClone {

    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        textNode = new TextNode("test");
    }

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();
        assertEquals("test", clone.getWholeText());
    }

}