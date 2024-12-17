package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedNewUrlBuilder {

    public static class UrlBuilderTest {
        @Mock
        private Connection.KeyVal kv;

        @Mock
        private URL inputUrl;

        @Test
        public void newUrlBuilder() {
            UrlBuilder builder = new UrlBuilder(inputUrl);
            assert builder != null;
        }

    }