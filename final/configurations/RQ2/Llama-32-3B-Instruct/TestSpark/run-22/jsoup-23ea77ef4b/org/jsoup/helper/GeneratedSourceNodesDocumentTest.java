package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSourceNodesDocumentTest {

    @Test
    public void sourceNodesDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        NodeList nodeList = doc.getChildNodes();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

}