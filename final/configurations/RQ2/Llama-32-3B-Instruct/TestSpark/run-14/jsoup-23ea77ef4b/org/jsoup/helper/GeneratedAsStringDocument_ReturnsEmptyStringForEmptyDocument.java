package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedAsStringDocument_ReturnsEmptyStringForEmptyDocument {

    @Test
    public void asStringDocument_ReturnsEmptyStringForEmptyDocument() {
        String result = new W3CDom().asString(null);
        assertEquals("", result);
    }

}