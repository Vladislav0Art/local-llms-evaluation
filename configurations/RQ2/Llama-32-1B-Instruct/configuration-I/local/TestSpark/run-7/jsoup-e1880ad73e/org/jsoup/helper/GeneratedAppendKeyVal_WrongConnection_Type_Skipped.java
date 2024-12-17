package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppendKeyVal_WrongConnection_Type_Skipped {

    public static class KvUtil {
        public void appendKeyVal(String key, String value) {
            // implement logic to append key-value pair
        }
    }

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal_WrongConnection_Type_Skipped() {
        String url = "https://example.com/path";
        Connection.KeyVal connection = new Connection.KeyVal("wrong_type", "value");

        when(kv.value()).thenReturn(connection);
        try {
            URL result = UrlBuilder.build();
            fail("expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }

        verifyNoException();
    }

}