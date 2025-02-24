package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlankEmptyTest {

    @Test
    public void isBlankEmptyTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}