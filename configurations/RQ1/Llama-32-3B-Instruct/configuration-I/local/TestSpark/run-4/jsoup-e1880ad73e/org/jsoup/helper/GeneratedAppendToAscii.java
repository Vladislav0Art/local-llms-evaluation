package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;

public class GeneratedAppendToAscii {

    @Mock
    Connection.KeyVal kv;

    @Test
    public void appendToAscii() {
        // Arrange and Act
        when(mockStringUtil.borrowBuilder()).thenReturn(new StringBuilder());

        urlBuilder.appendToAscii("http%2F%2Fexample.com", false);

        // Verify the result
        assertNotNull(urlBuilder.u);
    }

}