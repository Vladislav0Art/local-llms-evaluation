package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedNewNodeTextNode {

    @Test
    public void newNodeTextNode() {
        LeafNode newNode = new LeafNode();
        newNode.createFromEncoded("test");
        assertNotNull(newNode);
        assertEquals("#text", newNode.tag());
    }

}