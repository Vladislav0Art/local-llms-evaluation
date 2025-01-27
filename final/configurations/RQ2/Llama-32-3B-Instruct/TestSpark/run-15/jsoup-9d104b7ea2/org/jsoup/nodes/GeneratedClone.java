package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

public class GeneratedClone {

    private Document documentBuilder = new Document();

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello World");
        TextNode result = (TextNode) node.clone();
        assertNotNull(result);
    }

    private class Document implements Appendable {
        @Override
        public StringBuffer append(StringBuffer value) {
            return value;
        }
    }

}