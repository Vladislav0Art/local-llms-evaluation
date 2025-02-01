package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("    ");
        assertTrue(node.isBlank());
    }

}