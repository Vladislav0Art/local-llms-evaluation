package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org/");
        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);

        Node w3cNode = dom.contextNode(w3cDocument);
        assertNotNull(w3cNode);
        assertEquals(w3cNode.getUserData("jsoupSource"), jsoupDocument.child(0));
    }

}