package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNode_fromMultipleChars_isNotBlank {

    @Test
    public void createTextNode_fromMultipleChars_isNotBlank() {
        TextNode textNode = new TextNode("ab");
        assertFalse(textNode.isBlank());
    }

}