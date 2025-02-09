package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Hello</p><div>World</div></body</html>");
        Document w3CDoc = W3CDom.convert(jsoupDoc);
        NodeList nodeList = w3CDoc.getElementsByTagName("*");
        List<Node> list = new W3CDom().sourceNodes(nodeList, Node.class);
        assertEquals(4, list.size());
    }

}