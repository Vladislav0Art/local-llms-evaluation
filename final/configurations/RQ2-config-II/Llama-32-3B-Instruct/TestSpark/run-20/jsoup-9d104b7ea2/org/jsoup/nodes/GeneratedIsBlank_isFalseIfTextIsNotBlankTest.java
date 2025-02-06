package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_isFalseIfTextIsNotBlankTest {

    @Test
    public void isBlank_isFalseIfTextIsNotBlankTest() {
        TextNode node = new TextNode("Hello World!");
        assertFalse(node.isBlank());
    }

}