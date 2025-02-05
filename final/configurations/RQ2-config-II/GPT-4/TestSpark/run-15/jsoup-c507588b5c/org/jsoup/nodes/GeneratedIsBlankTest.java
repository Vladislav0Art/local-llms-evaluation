package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String someText = "  ";
        TextNode tn = new TextNode(someText);
        assertTrue(tn.isBlank());
    }

}