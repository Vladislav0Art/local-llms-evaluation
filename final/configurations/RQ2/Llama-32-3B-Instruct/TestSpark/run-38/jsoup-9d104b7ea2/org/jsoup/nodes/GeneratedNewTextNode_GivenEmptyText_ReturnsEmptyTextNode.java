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

public class GeneratedNewTextNode_GivenEmptyText_ReturnsEmptyTextNode {

    @Test
    public void newTextNode_GivenEmptyText_ReturnsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}