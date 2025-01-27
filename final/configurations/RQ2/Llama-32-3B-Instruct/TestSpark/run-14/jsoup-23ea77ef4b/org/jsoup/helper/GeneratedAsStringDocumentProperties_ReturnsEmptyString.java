package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedAsStringDocumentProperties_ReturnsEmptyString {

    @Test
    public void asStringDocumentProperties_ReturnsEmptyString() {
        String result = W3CDom.asString(null, null);
        assertEquals("", result);
    }

}