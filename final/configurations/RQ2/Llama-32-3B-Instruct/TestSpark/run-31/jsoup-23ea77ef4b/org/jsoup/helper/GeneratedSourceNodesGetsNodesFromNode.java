package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodesGetsNodesFromNode {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void sourceNodesGetsNodesFromNode() {
        NodeList nodeList = documentFactory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream("xml".getBytes())).getElementsByTagName("node");
        List<Node> expected = new ArrayList<>();
        expected.add(nodeList.item(0));
        List<Node> actual = W3CDom.sourceNodes(nodeList, Node.class);
        org.junit.Assert.assertEquals(expected, actual);
    }

}