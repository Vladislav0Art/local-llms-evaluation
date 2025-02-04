package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}