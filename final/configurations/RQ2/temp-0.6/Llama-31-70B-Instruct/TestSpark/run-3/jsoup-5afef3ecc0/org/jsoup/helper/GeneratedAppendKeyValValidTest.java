package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValValidTest {

    @Test
    public void appendKeyValValidTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://valid.com"));
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        assertNull(urlBuilder.appendKeyVal(keyVal));
    }

}