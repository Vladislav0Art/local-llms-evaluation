package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal_Succeeds {

    @Test
    public void testAppendKeyVal_Succeeds() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param1=value1&param2=value2"));
        when(urlBuilder.appendKeyVal(mock(Connection.KeyVal.class))).thenReturn(true);
        String actualOutput = urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1"));
        assertTrue(actualOutput.equals("param1=value1&param2=value2"));
    }

}