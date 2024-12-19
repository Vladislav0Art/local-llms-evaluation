package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValueWithKeyAndValueTest {

    @Test
    public void appendKeyValueWithKeyAndValueTest() throws UnsupportedEncodingException {
        String url = "http://example.com/path";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        when(builder.appendKeyVal(kv)).thenReturn(builder);
        assertEquals("http://example.com/path?key=value", builder.build());
    }

}