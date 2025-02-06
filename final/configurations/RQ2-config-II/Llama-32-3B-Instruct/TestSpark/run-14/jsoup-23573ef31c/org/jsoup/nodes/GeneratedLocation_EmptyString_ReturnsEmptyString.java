package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedLocation_EmptyString_ReturnsEmptyString {

    @Test
    public void location_EmptyString_ReturnsEmptyString() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        assertNull(document.location());
    }

}