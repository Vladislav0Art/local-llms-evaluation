package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsBlankWithNonBlankTest {

    @Test
    public void isBlankWithNonBlankTest() {
        TextNode textNode = new TextNode("foo");
        assertEquals(false, textNode.isBlank());
    }

}