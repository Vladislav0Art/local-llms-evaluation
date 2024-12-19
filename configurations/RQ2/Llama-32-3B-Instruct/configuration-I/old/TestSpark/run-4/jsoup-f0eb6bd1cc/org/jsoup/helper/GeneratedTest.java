package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    @Mock
    private Connection.KeyVal kv;

    public static class MockConnection {
        public static void setKeyVal(String key, String value) {
            Mockito.when(kv.getKey()).thenReturn(key);
            Mockito.when(kv.getValue()).thenReturn(value);
        }
    }

    public static class MockURL {
        public static String toString() {
            return "http://example.com";
        }
    }

    @Mock
    private URL inputUrl;

}