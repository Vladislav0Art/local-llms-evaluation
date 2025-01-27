package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupElement_ReturnsNull {

    @Test
    public void fromJsoupElement_ReturnsNull() {
        Document document = W3CDom.fromJsoup(null);
        assertNull(document);
    }

}