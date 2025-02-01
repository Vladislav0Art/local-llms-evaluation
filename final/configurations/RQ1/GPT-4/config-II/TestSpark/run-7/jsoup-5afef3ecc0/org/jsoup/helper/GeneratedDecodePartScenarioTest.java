package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePartScenarioTest {

    @Test
    public void decodePartScenarioTest() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.decodePart("%ZZ");
    }

}