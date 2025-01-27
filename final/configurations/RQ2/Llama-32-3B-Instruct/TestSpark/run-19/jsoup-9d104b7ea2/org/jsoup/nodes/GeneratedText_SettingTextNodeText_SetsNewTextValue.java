package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedText_SettingTextNodeText_SetsNewTextValue {

    @Test
    public void text_SettingTextNodeText_SetsNewTextValue() {
        TextNode node = new TextNode("Old");
        node.text("New");
        assertEquals("New", node.text());
    }

}