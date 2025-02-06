package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedSelectXpath_xpathDocumentReturnsCorrectNodeList {

    @Test
    public void selectXpath_xpathDocumentReturnsCorrectNodeList() {
        String xpath = Mockito.mock(String.class);
        Document doc = Mockito.mock(Document.class);
        NodeList expected = Mockito.mock(NodeList.class);
        NodeList result = W3CDom.selectXpath(xpath, doc);
        assertEquals(expected, result);
    }

}