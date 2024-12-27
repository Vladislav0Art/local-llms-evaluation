package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSelectXpath_ValidXpath {

    @Test
    public void selectXpath_ValidXpath() {
        Document validDoc = org.jsoup.nodes.Document.parse("<div><span>Hello</span> World!</div>");
        String validXpath = "//span";
        Element result = W3CDom.selectXpath(validXpath, validDoc);
        assert result != null;
    }

}