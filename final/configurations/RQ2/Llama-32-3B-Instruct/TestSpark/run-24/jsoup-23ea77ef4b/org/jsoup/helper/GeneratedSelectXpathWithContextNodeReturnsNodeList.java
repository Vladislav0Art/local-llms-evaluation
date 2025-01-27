package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathWithContextNodeReturnsNodeList {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void selectXpathWithContextNodeReturnsNodeList() {
        List<String> list = new ArrayList<>();
        list.add("test");
        Node contextNode = new org.w3c.dom.Node();
        NodeList result = org.jsoup.helper.W3CDom.selectXpath(list, contextNode);
        assertNotNull(result);
    }

}