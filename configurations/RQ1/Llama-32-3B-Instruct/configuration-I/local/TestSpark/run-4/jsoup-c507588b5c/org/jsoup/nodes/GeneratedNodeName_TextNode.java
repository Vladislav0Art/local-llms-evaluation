package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedNodeName_TextNode {

    @Test
    public void nodeName_TextNode() {
        String text = "text";
        TextNode node = new TextNode(text);
        assertEquals("#text", node.nodeName());
    }

}