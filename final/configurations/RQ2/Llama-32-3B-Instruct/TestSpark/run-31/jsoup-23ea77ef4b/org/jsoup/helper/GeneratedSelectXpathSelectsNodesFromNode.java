package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathSelectsNodesFromNode {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void selectXpathSelectsNodesFromNode() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        NodeList expected = document.getElementsByTagName("node");
        NodeList actual = W3CDom.selectXpath("//node", document.getDocumentElement());
        org.junit.Assert.assertEquals(expected, actual);
    }

}