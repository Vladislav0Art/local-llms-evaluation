package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

import javax.annotation.Nullable;

public class GeneratedBuilderUrlWithQueryParameterTest {

    @Test
    public void builderUrlWithQueryParameterTest() throws URISyntaxException, UnsupportedEncodingException {
        String inputUri = "https://www.example.com/path/to/resource?param=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUri));
        URL builtUrl = urlBuilder.build();
        assertEquals("https://www.example.com" + inputUri, builtUrl.toString());
    }

}