package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSelectXpath_xpathIsEmpty {

    @Test
    public void selectXpath_xpathIsEmpty() {
        NodeList nodeList = W3CDom.selectXpath("", new org.w3c.dom.Document());
        assertTrue(nodeList.getLength() == 0);
    }

}