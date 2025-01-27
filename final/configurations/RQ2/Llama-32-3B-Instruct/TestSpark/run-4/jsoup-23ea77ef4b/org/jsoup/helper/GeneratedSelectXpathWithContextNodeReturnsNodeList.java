package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathWithContextNodeReturnsNodeList {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @InjectMocks
    private W3CDom w3cdom;

    @Test
    public void selectXpathWithContextNodeReturnsNodeList() {
        String xpath = "xpath";
        Node contextNode = mock(Node.class);
        NodeList nodeList = w3cdom.selectXpath(xpath, contextNode);
        assertNotNull(nodeList);
    }

}