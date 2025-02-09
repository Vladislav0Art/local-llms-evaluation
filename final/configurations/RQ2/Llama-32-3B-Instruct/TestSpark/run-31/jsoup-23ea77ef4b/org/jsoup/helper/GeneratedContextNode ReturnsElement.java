package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedContextNode ReturnsElement {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void contextNode

    ReturnsElement() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        Element element = document.getDocumentElement();
        Node expected = element;
        Node result = W3CDom.contextNode(document);
        org.junit.Assert.assertEquals(expected, result);
    }

}