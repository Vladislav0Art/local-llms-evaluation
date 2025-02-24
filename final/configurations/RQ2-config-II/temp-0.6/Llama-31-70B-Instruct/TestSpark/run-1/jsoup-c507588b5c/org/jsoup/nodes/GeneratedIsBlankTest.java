package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode1 = new TextNode(" ");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("text");
        assertFalse(textNode2.isBlank());
    }

}