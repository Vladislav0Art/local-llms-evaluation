package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyVal_NullInput {

    @Test
    public void testAppendKeyVal_NullInput() {
        UrlBuilder urlBuilder = new UrlBuilder(mock(URL.class));
        when(urlBuilder.appendKeyVal(null)).thenReturn(true);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("param1", "value1")));
    }

}