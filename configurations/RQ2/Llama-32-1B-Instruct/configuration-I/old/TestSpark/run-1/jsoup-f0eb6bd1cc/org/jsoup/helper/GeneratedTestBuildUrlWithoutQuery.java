package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class GeneratedTestBuildUrlWithoutQuery {

    @Test
    public void testBuildUrlWithoutQuery() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");

        URL urlObject = urlBuilder.build();
        assertNotNull(urlObject);
        assertTrue(urlObject.toString().contains("https://example.com/path"));
    }

}