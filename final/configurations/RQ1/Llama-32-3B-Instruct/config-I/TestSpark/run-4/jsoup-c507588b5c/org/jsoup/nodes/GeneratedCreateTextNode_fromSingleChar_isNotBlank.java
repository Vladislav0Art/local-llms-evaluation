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

public class GeneratedCreateTextNode_fromSingleChar_isNotBlank {

    @Test
    public void createTextNode_fromSingleChar_isNotBlank() {
        TextNode textNode = new TextNode("a");
        assertFalse(textNode.isBlank());
    }

}