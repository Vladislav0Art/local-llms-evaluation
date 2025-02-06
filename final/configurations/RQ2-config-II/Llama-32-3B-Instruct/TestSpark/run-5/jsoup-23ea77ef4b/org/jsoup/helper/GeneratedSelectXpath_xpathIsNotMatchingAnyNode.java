package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSelectXpath_xpathIsNotMatchingAnyNode {

    @Test
    public void selectXpath_xpathIsNotMatchingAnyNode() throws Exception {
        Document doc = new org.w3c.dom.Document();
        NodeList nodeList = W3CDom.selectXpath("nonExistentXPath", doc);
        assertEquals(0, nodeList.getLength());
    }

}