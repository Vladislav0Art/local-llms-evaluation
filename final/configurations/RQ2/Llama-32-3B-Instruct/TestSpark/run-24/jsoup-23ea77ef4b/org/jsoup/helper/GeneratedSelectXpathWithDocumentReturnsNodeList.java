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
public class GeneratedSelectXpathWithDocumentReturnsNodeList {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void selectXpathWithDocumentReturnsNodeList() {
        List<String> list = new ArrayList<>();
        list.add("test");
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        NodeList result = org.jsoup.helper.W3CDom.selectXpath(list, in);
        assertNotNull(result);
    }

}