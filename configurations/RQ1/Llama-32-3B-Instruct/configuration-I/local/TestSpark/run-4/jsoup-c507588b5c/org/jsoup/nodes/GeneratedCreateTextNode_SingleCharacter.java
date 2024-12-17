package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCreateTextNode_SingleCharacter {

    @Test
    public void createTextNode_SingleCharacter() {
        String text = "a";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
        assertEquals(1, node.text().length());
    }

}