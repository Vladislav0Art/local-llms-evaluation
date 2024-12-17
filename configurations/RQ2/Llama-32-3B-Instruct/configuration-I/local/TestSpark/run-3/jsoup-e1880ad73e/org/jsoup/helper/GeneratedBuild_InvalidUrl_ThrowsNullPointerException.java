package org.jsoup.helper;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;

public class GeneratedBuild_InvalidUrl_ThrowsNullPointerException {

    @Test
    public void build_InvalidUrl_ThrowsNullPointerException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        NullPointerException expectedException = new NullPointerException("Input URL is null");
        org.junit.Assert.fail(expectedException.getMessage());
    }

}