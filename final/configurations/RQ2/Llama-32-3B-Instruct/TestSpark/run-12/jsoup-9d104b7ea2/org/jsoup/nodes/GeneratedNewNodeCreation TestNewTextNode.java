package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Text;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewNodeCreation TestNewTextNode {

    @Test
    public void newNodeCreation

    TestNewTextNode() {
        Object newTextNode = null;
        newTextNode = new TextNode("Hello, World!");
        assertNotNull(newTextNode);
    }

}