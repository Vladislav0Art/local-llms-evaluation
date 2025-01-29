package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param1=value1&param2=value2"));
        when(urlBuilder.appendKeyVal(mock(Connection.KeyVal.class))).thenReturn(true);

        String expectedOutput = "https://example.com/path?param1=value1&param2=value2";
        String actualOutput = urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1"));
        assertEquals(expectedOutput, actualOutput);
    }

}