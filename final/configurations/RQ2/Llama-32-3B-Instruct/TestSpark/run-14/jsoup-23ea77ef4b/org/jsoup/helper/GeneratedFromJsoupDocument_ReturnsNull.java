package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupDocument_ReturnsNull {

    @Test
    public void fromJsoupDocument_ReturnsNull() {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Document out = new W3CDom().convert(document);
        assertNotNull(out);
    }

}