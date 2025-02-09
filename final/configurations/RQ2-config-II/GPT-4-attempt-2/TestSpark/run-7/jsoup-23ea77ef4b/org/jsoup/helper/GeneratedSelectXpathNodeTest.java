package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        assertNotNull(w3cDom.selectXpath("", node));
    }

}