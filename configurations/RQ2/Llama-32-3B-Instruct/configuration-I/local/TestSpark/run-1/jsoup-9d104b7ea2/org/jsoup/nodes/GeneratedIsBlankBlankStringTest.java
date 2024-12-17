package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedIsBlankBlankStringTest {

    @Test
    public void isBlankBlankStringTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}