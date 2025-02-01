package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String blankString = "  ";
        TextNode blankTextNode = new TextNode(blankString);
        assertTrue(blankTextNode.isBlank());

        String nonBlankString = "Test String";
        TextNode nonBlankTextNode = new TextNode(nonBlankString);
        assertFalse(nonBlankTextNode.isBlank());
    }

}