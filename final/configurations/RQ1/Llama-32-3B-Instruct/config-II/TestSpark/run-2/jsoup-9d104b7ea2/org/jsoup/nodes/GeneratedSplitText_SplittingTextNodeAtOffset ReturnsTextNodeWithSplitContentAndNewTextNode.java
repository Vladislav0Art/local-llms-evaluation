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

public class GeneratedSplitText_SplittingTextNodeAtOffset ReturnsTextNodeWithSplitContentAndNewTextNode {

    @Test
    public void splitText_SplittingTextNodeAtOffset

    ReturnsTextNodeWithSplitContentAndNewTextNode() throws IOException {
        // [MethodUnderTest][Scenario]Test
        TextNode textNode = new TextNode("Hello\nWorld");
        TextNode result1 = textNode.splitText(0);
        TextNode result2 = textNode.splitText(5);
        assertNotNull(result1);
        assertNotNull(result2);
    }

}