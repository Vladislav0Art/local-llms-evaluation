package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertElementFromJsoupConvertsElementCorrectly {

    @Test
    public void convertElementFromJsoupConvertsElementCorrectly() throws Exception {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Element element = document.getElementById("test");
        Document out = new W3CDom().convert(element);
        assertNotNull(out);
    }

}