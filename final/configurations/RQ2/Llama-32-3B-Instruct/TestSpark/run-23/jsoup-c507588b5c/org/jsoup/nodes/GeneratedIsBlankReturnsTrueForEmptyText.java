package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;

public class GeneratedIsBlankReturnsTrueForEmptyText {

    @Test
    public void isBlankReturnsTrueForEmptyText() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}