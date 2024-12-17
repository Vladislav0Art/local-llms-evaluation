package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyVal_WithInvalidParamType_RaisesUnsupportedEncodingException {

    @Mock
    private Connection connection;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyVal_WithInvalidParamType_RaisesUnsupportedEncodingException() {
        Map<String, String> expectedMap = new HashMap<>();
        when(connection.getUrl()).thenReturn(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal(null, "value1"));
        assertTrue(urlBuilder.isParamAddedFailed());
    }

}