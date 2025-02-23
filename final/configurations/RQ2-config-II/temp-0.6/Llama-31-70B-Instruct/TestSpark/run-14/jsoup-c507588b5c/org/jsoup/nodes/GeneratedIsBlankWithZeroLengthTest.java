package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsBlankWithZeroLengthTest {

    @Test
    public void isBlankWithZeroLengthTest() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

}