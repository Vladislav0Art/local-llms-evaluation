package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithQuery {

    public String decodePart(String input, Object encoding, Object original) {
        // implementation of decodePart method
        return "";
    }

    public void appendToAscii(String input, boolean includeFragment, StringBuilder sb) {
        // implementation of appendToAscii method
    }

    @Test
    public void buildUrlWithQuery() {
        // Arrange and Act
        urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value"));
        when(mockStringUtil.borrowBuilder()).thenReturn(new StringBuilder());

        // Verify the result
        assertNotNull(urlBuilder.u);
        assertEquals("http://example.com/path?query=value", urlBuilder.u.getQuery());
    }

}