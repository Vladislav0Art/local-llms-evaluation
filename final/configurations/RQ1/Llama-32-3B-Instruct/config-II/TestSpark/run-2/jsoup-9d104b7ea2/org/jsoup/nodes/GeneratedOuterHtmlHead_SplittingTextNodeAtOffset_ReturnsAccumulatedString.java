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

public class GeneratedOuterHtmlHead_SplittingTextNodeAtOffset_ReturnsAccumulatedString {

    @Test
    public void outerHtmlHead_SplittingTextNodeAtOffset_ReturnsAccumulatedString() throws IOException {
        // [MethodUnderTest][Scenario]Test
        Document document = new Document();
        TextNode textNode = new TextNode("Hello\nWorld");
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("Hello", accum.toString());
    }

}