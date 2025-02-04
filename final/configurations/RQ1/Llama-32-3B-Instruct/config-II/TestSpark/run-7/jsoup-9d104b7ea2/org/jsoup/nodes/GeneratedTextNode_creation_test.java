package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedTextNode_creation_test {

    @Test
    public void textNode_creation_test() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

}