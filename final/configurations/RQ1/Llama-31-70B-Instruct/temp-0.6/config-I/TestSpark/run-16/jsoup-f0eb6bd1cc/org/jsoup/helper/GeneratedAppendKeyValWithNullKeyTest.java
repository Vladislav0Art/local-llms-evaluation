package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithNullKeyTest {

    @Test
    public void appendKeyValWithNullKeyTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal(null, "value");
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(keyVal));
    }

}