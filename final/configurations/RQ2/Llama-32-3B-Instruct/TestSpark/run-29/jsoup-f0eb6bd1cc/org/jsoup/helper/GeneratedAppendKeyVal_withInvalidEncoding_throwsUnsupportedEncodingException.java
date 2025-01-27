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
public class GeneratedAppendKeyVal_withInvalidEncoding_throwsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    @Before
    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void appendKeyVal_withInvalidEncoding_throwsUnsupportedEncodingException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value with invalid encoding")));
    }

}