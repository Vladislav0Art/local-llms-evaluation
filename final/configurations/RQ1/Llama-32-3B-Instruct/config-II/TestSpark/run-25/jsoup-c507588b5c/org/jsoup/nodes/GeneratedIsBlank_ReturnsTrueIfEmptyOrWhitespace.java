package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlank_ReturnsTrueIfEmptyOrWhitespace {

    @Test
    public void isBlank_ReturnsTrueIfEmptyOrWhitespace() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());
    }

}