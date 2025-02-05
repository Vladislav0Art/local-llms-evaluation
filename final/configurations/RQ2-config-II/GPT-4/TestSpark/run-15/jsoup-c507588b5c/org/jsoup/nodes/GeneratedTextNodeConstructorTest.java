package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void TextNodeConstructorTest() {
        String text = "Test";
        TextNode tn = new TextNode(text);
        assertEquals(text, tn.getWholeText());
    }

}