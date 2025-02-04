package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneTextNodeReturnsSameInstance {

    @Test
    public void cloneTextNodeReturnsSameInstance() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = node.clone();
        assertTrue(cloned == node);
    }

}