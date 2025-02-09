package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlankWhenEmptyTest {

    @Test
    public void isBlankWhenEmptyTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}