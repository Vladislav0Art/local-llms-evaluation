package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com/path?param=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Objects.requireNonNull(urlBuilder);
    }

}