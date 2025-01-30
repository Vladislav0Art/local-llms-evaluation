package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePartTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void decodePartTest() throws Exception {
        URL url = new URL("http://127.0.0.1/this%Gis%a%test");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.build();

        // Expected to throw a RuntimeException
    }

}