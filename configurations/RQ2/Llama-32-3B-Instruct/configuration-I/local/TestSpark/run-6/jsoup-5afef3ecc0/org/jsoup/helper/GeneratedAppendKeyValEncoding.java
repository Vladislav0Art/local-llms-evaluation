package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedAppendKeyValEncoding {

    public static class UrlBuilderTest {
        @Mock
        private Connection.KeyVal kv;

        @Mock
        private URL inputUrl;

        @Test
        public void appendKeyValEncoding() throws java.lang.UnsupportedEncodingException {
            Mockito.when(kv.getKey()).thenReturn("key");
            Mockito.when(kv.getValue()).thenReturn("value");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            org.junit.Assert.assertTrue(builder.build().contains(java.util.Map.of(
                    Connection.KeyVal.KEY_NAME, "key",
                    Connection.KeyVal.VALUE_NAME, "value")));
        }
    }

    public class Mock {
        private Object object;

        public Mock(Object o) {
            this.object = o;
        }

        public void when() {
        }
    }

}