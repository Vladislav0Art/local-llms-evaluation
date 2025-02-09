package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderConstructorNullPointerTest {

    @Test
    public void UrlBuilderConstructorNullPointerTest() throws NullPointerException {
        new UrlBuilder(null);
    }

}