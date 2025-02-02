package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.io.IOException;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());
        assertFalse(new TextNode("   ").isBlank());

        TextNode nonBlankTextNode = new TextNode(" ");
        assertFalse(nonBlankTextNode.isBlank());
    }

}