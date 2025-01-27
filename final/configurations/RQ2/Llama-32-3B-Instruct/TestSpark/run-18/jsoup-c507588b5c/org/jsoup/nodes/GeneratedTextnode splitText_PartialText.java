package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnode splitText_PartialText {

    @Test
    public void textnode

    splitText_PartialText() throws IOException {
        TextNode textNode = new TextNode("test");
        TextNode expectedPart1 = new TextNode("te");
        TextNode expectedPart2 = new TextNode("st");
        assertEquals(expectedPart1.text(), textNode.splitText(0).text());
        assertEquals(expectedPart2.text(), textNode.splitText(3).text());
    }

}