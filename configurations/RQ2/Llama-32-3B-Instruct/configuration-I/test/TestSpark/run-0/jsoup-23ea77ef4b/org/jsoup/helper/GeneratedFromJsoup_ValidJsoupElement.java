package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFromJsoup_ValidJsoupElement {

    @Test
    public void fromJsoup_ValidJsoupElement() {
        Element validElement = Mockito.mock(Element.class);
        Document convertedDoc = W3CDom.fromJsoup(validElement);
        assert convertedDoc != null;
    }

}