package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvert_InvalidJsoupElement {

    @Test
    public void convert_InvalidJsoupElement() {
        Element invalidElement = null;
        W3CDom.convert(invalidElement);
    }

}