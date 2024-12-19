package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendKeyVal {

    public static class UrlBuilderTest {
        @Mock
        private Connection.KeyVal kv;

        @Mock
        private URL inputUrl;

        @Test
        public void appendKeyVal() {
            Mockito.when(kv.getKey()).thenReturn("key");
            Mockito.when(kv.getValue()).thenReturn("value");
            java.util.Map<String, String> map = new java.util.HashMap<>();
            map.put("key", "value");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            org.junit.Assert.assertTrue(builder.build().contains(map));
        }

    }