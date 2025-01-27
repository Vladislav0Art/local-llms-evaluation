package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_withValidKeyVal_addsCorrectKeyAndValue {

    @Mock
    private Connection connection;

    @Before
    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void appendKeyVal_withValidKeyVal_addsCorrectKeyAndValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);

        String query = urlBuilder.build().getQuery();
        assertEquals("key=value", query);
    }

}