package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank_NonBlankText {

    @Test
    public void testIsBlank_NonBlankText() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());
    }

}