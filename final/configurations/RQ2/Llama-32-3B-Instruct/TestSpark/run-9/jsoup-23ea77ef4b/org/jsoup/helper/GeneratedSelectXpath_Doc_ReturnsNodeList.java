package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSelectXpath_Doc_ReturnsNodeList {

    @Test
    public void selectXpath_Doc_ReturnsNodeList() {
        Document doc = Mockito.mock(Document.class);
        NodeList expected = Mockito.mock(NodeList.class);
        when(doc.getChildNodes()).thenReturn(expected);
        NodeList result = W3CDom.selectXpath("xpath", doc);
        assertEquals(expected, result);
    }

}