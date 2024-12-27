package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_ValidJsoupElement {

    @Test
    public void convert_ValidJsoupElement() {
        Element validElement = Mockito.mock(Element.class);
        Document convertedDoc = W3CDom.convert(validElement);
        assert convertedDoc != null;
    }

}