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
public class GeneratedOutputXmlReturnsHashMap {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void OutputXmlReturnsHashMap() {
        List<String> list = new ArrayList<>();
        list.add("test");
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        HashMap<String, String> result = org.jsoup.helper.W3CDom.OutputXml(list, in);
        assertNotNull(result);
    }

}