package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

}