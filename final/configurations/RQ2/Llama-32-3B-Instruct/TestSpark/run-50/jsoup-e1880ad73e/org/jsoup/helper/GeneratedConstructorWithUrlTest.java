package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedConstructorWithUrlTest {

    @Test
    public void constructorWithUrlTest() {
        // Arrange
        URL url = Mockito.mock(URL.class);
        UrlBuilder builder = new UrlBuilder(url);

        // Assert
        assert builder != null;
    }

}