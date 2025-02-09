package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedNodeName_ForTextNode_ReturnsNodeName {

    @Test
    public void nodeName_ForTextNode_ReturnsNodeName() {
        String nodeName = "text-node";
        TextNode textNode = new TextNode(nodeName);
        assertEquals(nodeName, textNode.nodeName());
    }

}