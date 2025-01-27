package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpathDocument_XPATHReturnsEmptyList {

    @Test
    public void selectXpathDocument_XPATHReturnsEmptyList() {
        NodeList result = W3CDom.selectXpath("//*/text()", null);
        assertTrue(result.getLength() == 0);
    }

}