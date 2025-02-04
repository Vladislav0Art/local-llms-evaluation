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

public class GeneratedIsBlank_GivenEmptyTextNode_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyTextNode_ReturnsTrue() {
        // [MethodUnderTest][Scenario]Test
        TextNode textNode = new TextNode();
        assertTrue(textNode.isBlank());
    }

}