package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTextUpdateTest {

    @Test
    public void textUpdateTest() {
        TextNode textNode = new TextNode("Test");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}