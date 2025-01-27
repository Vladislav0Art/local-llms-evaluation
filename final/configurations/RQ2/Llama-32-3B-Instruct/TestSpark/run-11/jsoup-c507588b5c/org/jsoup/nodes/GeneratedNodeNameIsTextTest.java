package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtilImpl;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedNodeNameIsTextTest {

    @Test
    public void nodeNameIsTextTest() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.nodeName());
    }

}