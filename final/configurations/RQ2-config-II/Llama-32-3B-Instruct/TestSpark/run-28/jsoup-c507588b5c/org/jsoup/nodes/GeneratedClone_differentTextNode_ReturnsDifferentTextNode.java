package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedClone_differentTextNode_ReturnsDifferentTextNode {

    @Test
    public void clone_differentTextNode_ReturnsDifferentTextNode() {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotSame(originalTextNode, clonedTextNode);
    }

}