package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorWithUrl_ReturnsInstance {

    @Test
    public void constructorWithUrl_ReturnsInstance() {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assert builder.build().equals(url);
    }

}