package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameTextNode returnsCorrectName {

    @Test
    public void nodeNameTextNode

    returnsCorrectName() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

}