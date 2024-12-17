package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedText_DuplicateSpaces {

    @Test
    public void text_DuplicateSpaces() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals("   ", node.text());
    }

}