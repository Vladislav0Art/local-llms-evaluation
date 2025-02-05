package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderNullURLTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void UrlBuilderNullURLTest() {
        thrown.expect(NullPointerException.class);
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

}