package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode tn = new TextNode("sample");
        tn.text("new sample");
        assertEquals("new sample", tn.text());
    }

}