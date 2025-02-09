package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankWhenNotEmptyTest {

    @Test
    public void isBlankWhenNotEmptyTest() {
        TextNode node = new TextNode("Non empty text");
        assertFalse(node.isBlank());
    }

}