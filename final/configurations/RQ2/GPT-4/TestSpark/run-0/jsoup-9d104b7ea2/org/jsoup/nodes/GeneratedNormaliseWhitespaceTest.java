package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "  Norma  lize     W hitespace   ";
        assertEquals(" Normalize Whitespace ", TextNode.normaliseWhitespace(text));
    }

}