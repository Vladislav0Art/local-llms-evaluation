package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = (TextNode) originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals("#text", clonedTextNode.nodeName());
    }

}