package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlankTest_Empty {

    @Test
    public void isBlankTest_Empty() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}