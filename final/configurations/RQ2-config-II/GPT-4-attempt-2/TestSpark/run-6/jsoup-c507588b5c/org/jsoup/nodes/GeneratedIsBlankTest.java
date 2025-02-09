package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankTextNode = new TextNode("");
        assertTrue(blankTextNode.isBlank());

        TextNode nonEmptyTextNode = new TextNode("Sample Text");
        assertFalse(nonEmptyTextNode.isBlank());
    }

}