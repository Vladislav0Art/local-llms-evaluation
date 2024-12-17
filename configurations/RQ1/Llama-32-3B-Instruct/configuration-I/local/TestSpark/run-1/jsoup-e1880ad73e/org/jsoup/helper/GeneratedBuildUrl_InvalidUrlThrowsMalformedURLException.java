package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl_InvalidUrlThrowsMalformedURLException {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void buildUrl_InvalidUrlThrowsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null));
    }

}