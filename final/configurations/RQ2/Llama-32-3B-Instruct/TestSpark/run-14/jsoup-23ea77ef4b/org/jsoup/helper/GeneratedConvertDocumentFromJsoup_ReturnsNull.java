package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertDocumentFromJsoup_ReturnsNull {

    @Test
    public void convertDocumentFromJsoup_ReturnsNull() {
        Document document = W3CDom.convert(null);
        assertNull(document);
    }

}