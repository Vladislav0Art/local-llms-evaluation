package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        assertNotNull(w3cDom.sourceNodes(nodeList, Comment.class));
    }

}