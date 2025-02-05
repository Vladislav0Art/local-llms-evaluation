package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSourceNodesNullNodeListTest {

    @Test
    public void sourceNodesNullNodeListTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.sourceNodes(null, Document.class);
    }

}