package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpathContextNode_XPATHReturnsEmptyList {

    @Test
    public void selectXpathContextNode_XPATHReturnsEmptyList() {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Element element = document.getElementById("test");
        NodeList result = W3CDom.selectXpath("//*/text()", element);
        assertTrue(result.getLength() == 0);
    }

}