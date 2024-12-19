package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextTests {

    @Test
    public void getWholeTextTests() {
        String text = "Hello World";
        assertTrue(new TextNode(text).getWholeText().equals(text));
    }

}