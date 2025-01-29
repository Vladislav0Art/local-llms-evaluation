package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        ConnectionKeyVal kv1 = new Connection.KeyVal("key1", "value1");
        URLBuilder builder = new UrlBuilder();
        builder.appendKeyVal(kv1);
        assertEquals("https://example.com", builder.inputUrl(UTF_8));
    }

}