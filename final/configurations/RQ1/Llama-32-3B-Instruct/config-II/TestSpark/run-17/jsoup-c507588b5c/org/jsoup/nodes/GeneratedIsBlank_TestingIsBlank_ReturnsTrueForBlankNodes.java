package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_TestingIsBlank_ReturnsTrueForBlankNodes {

    @Test
    public void isBlank_TestingIsBlank_ReturnsTrueForBlankNodes() throws Exception {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());
    }

}