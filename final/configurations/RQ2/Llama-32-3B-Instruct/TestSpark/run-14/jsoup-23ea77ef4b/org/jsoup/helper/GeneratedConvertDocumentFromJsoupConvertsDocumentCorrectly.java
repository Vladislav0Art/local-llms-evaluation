package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertDocumentFromJsoupConvertsDocumentCorrectly {

    @Test
    public void convertDocumentFromJsoupConvertsDocumentCorrectly() throws Exception {
        Document in = W3Dom.documentBuilder().parse(new StringWriter());
        Document out = new W3CDom().convert(in);
        assertNotNull(out);
    }

}