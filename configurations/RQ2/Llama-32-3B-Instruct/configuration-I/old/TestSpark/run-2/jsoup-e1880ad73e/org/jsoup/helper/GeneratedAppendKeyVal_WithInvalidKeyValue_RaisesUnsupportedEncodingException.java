package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_WithInvalidKeyValue_RaisesUnsupportedEncodingException {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyVal_WithInvalidKeyValue_RaisesUnsupportedEncodingException() {
        when(connection.getUrl()).thenReturn(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", null));
        assertTrue(urlBuilder.isParamAddedFailed());
    }

}