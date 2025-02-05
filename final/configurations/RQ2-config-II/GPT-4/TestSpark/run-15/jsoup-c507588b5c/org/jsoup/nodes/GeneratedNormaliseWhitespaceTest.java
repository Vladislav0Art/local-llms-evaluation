package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = " T e s t";
        String normalisedText = TextNode.normaliseWhitespace(textWithWhitespace);
        assertEquals("Test", normalisedText);
    }

}