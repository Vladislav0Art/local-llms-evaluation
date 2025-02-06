package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpath_XPathResult_WithNodeList {

    @Mock
    private Document doc;

    @Test
    public void selectXpath_XPathResult_WithNodeList() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        when(nodeList.getLength()).thenReturn(1);
        W3CDom.selectXpath("xpath", doc).equals(nodeList);
    }

}