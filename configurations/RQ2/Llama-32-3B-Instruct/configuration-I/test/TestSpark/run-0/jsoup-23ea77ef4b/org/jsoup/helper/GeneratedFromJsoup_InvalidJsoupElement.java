package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromJsoup_InvalidJsoupElement {

    @Test
    public void fromJsoup_InvalidJsoupElement() {
        Element invalidElement = Mockito.mock(Element.class);
        assert W3CDom.fromJsoup(invalidElement) == null;
    }

}