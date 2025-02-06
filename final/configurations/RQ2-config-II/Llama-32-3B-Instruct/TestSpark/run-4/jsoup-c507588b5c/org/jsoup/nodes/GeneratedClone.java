package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode originalTextNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = originalTextNode.clone();
        assertSame(originalTextNode, clonedTextNode);
    }

}