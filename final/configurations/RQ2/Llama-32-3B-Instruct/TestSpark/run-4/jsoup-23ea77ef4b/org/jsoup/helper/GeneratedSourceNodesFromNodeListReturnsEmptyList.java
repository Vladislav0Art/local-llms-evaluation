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
public class GeneratedSourceNodesFromNodeListReturnsEmptyList {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @InjectMocks
    private W3CDom w3cdom;

    @Test
    public void sourceNodesFromNodeListReturnsEmptyList() {
        NodeList nodeList = mock(NodeList.class);
        Class<?> nodeType = mock(Class.class);
        List<?> result = w3cdom.sourceNodes(nodeList, nodeType);
        assertEquals(0, result.size());
    }

}