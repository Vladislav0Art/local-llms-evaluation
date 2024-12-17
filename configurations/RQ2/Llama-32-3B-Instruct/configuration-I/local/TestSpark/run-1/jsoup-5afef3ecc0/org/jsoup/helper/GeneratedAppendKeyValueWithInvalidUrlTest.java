package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValueWithInvalidUrlTest {

    @Test
    public void appendKeyValueWithInvalidUrlTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, null);
        UrlBuilder builder = new UrlBuilder(null);
        try {
            builder.appendKeyVal(kv);
            assert false;
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}