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

public class GeneratedGetChildNodes TextNodeGetChildNodesTest {

    @Test
    public void getChildNodes

    TextNodeGetChildNodesTest() {
        LeafNode leafNode = null;
        leafNode = new LeafNode();
        assertEquals(0, ((LeafNode) leafNode).getChildNodes().size());
    }

}