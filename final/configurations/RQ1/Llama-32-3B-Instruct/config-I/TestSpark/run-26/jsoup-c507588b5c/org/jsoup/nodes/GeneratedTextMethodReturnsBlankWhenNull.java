package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedTextMethodReturnsBlankWhenNull {

    @Test
    public void textMethodReturnsBlankWhenNull() {
        LeafNode node = new LeafNode();
        assertNotNull(node.text());
    }

}