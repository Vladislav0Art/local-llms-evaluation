package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest_AppendsKeyValToUrl {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValTest_AppendsKeyValToUrl() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new KeyVal("key", "value"));
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

}