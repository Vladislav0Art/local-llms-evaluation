package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSelectXpath_InvalidXpath {

    @Test
    public void selectXpath_InvalidXpath() {
        Document invalidDoc = org.jsoup.nodes.Document.parse("<div>Hello</div>");
        String invalidXpath = "//invalidxpath";
        Element result = W3CDom.selectXpath(invalidXpath, invalidDoc);
        assert result == null;
    }

}