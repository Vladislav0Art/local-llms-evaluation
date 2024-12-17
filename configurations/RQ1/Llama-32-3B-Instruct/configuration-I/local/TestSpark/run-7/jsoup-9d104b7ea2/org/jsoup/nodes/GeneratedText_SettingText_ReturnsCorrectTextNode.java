package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_SettingText_ReturnsCorrectTextNode {

    @Test
    public void text_SettingText_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        String newText = "New Text";
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

}