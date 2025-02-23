package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsBlankTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void isBlankTest() {
        assertEquals(false, textNode.isBlank());
    }

}