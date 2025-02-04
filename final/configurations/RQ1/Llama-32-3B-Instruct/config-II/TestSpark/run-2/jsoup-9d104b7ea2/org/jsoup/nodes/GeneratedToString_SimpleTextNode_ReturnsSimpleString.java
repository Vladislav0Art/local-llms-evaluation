package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.NodeContainer;
import org.jsoup.nodes.ParentNode;

public class GeneratedToString_SimpleTextNode_ReturnsSimpleString {

    @Test
    public void toString_SimpleTextNode_ReturnsSimpleString() {
        // [MethodUnderTest][Scenario]Test
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.toString());
    }

}