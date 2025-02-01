package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("Test");
        assertFalse(node.isBlank());
    }

}