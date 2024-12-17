package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyVal_SimpleScenario {

    public static class KvUtil {
        public void appendKeyVal(String key, String value) {
            // implement logic to append key-value pair
        }
    }

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void testAppendKeyVal_SimpleScenario() {
        String url = "https://example.com/path";

        KvUtil.appendKeyVal("test_key", "test_value");
        URL result = UrlBuilder.build();
        assertNotEquals(null, result);

        verify(KvUtil::appendKeyVal);
    }

}