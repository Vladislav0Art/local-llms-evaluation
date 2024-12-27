package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSelectXpath ValidXpath {

    @Test
    public void selectXpath

    ValidXpath() {
        Document validDoc = Mockito.mock(Document.class);
        NodeList result = W3CDom.selectXpath("//div", validDoc);
        assert result != null;
    }

}