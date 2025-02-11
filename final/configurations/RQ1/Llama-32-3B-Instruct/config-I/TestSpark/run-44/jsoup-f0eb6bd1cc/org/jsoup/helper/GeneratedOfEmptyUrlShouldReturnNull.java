package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.mockito.Mock;

public class GeneratedOfEmptyUrlShouldReturnNull {

    @Mock
    private Connection connection;

    @Test
    public void ofEmptyUrlShouldReturnNull() {
        UrlBuilder builder = new UrlBuilder(null);
        assert builder.u == null;
        assert builder.q == null;
    }

}