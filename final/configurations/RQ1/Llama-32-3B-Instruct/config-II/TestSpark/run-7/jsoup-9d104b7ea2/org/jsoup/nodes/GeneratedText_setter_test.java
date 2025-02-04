package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedText_setter_test {

    @Test
    public void text_setter_test() {
        TextNode textNode = new TextNode("");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text().trim());
    }

}