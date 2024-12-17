package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;

public class GeneratedBuildUrl {

    @Mock
    Connection.KeyVal kv;

    @Test
    public void buildUrl() {
        // Arrange and Act
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        String url = urlBuilder.buildUrl();

        // Verify the result
        assertNotNull(url);
    }

}