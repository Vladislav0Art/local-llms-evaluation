package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuild_NullInput_ThrowsNullPointerException {

    @Test
    public void build_NullInput_ThrowsNullPointerException() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, urlBuilder::build);
    }

}