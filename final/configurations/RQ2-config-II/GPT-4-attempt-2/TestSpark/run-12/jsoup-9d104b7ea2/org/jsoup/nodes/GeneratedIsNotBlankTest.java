package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotBlankTest {

    @Test
    public void isNotBlankTest() {
        TextNode tn = new TextNode("test text");
        assertFalse(tn.isBlank());
    }

}