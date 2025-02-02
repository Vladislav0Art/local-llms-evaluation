package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedSplitTextAtOffsetCreatesNewTextNode {

    @Test
    public void splitTextAtOffsetCreatesNewTextNode() throws IOException {
        LeafNode node = new LeafNode();
        String content = "test";
        node.createElement().append(content);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.io.PrintWriter pw = new java.io.PrintWriter(baos);
        Document document = new Document();
        document parentNode ().appendChild(node.createElement());
        java.io.Writer writer = Appendable.appending(new LeafNode());
        writer.append(document.outline());
        writer.flush();
        ArrayList<TextNode> children = LeafNode.addChildren(0, node.createElement());
        TextNode cloned = (TextNode) children.get(0);
        assertEquals(content, cloned.text());
    }

}