package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderConstructorNullUrlTest {

    @Test
    public void urlBuilderConstructorNullUrlTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(null);
            fail("Exception should have been thrown");
        } catch (NullPointerException e) {
            assertNotNull(e.getMessage());
        }
    }

}