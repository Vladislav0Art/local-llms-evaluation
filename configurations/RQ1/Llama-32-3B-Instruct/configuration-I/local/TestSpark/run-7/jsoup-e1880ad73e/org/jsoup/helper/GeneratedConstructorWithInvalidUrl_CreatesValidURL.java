package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedConstructorWithInvalidUrl_CreatesValidURL {

    @Test
    public void constructorWithInvalidUrl_CreatesValidURL() {
        URL u = new URL("invalid://path/to/resource?query=hello&key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        assertEquals(0, urlBuilder.u.getProtocol().length());
    }

}