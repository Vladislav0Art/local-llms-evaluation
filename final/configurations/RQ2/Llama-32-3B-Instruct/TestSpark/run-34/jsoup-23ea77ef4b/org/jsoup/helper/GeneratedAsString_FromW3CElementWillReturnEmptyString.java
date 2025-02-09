package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedAsString_FromW3CElementWillReturnEmptyString {

    @Test
    public void asString_FromW3CElementWillReturnEmptyString() {
        Element el = new Element();
        assertEquals("", W3CDom.asString(el));
    }

}