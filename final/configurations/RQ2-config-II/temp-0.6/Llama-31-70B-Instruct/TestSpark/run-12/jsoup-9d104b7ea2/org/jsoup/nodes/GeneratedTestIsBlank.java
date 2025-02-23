package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank {

    @Mock
    TextNode textNode;

    @Test
    public void testIsBlank() {
        String text = " ";
        TextNode textNode = new TextNode(text);
        assertEquals(true, textNode.isBlank());
    }

}