package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedAsStringDocument ReturnsEmptyStringForEmptyDocument {

    @Test
    public void asStringDocument

    ReturnsEmptyStringForEmptyDocument() {
        String result = new W3CDom().asString(null);
        assertEquals("", result);
    }

}