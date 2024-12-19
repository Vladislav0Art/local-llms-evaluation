package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedBuildUrl {

    public static class UrlBuilderTest {
        @Mock
        private Connection.KeyVal kv;

        @Mock
        private URL inputUrl;

        @Test
        public void buildUrl() {
            Mockito.when(inputUrl.toString()).thenReturn("http://example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            String result = builder.build();
            org.junit.Assert.assertEquals(result, "http://example.com", false);
        }

    }