package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedClone_originalTextNode_ReturnsSameTextNode {

    @Test
    public void clone_originalTextNode_ReturnsSameTextNode() {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}