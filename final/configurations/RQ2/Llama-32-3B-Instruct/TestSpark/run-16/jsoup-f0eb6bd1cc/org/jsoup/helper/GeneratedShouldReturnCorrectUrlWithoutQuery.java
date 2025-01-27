package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

public class GeneratedShouldReturnCorrectUrlWithoutQuery {

    @Mock
    private Connection connection;

    public static final String INPUT_URL = "https://example.com";

    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        System.out.println(UrlBuilderTest.main(INPUT_URL));
    }

    @BeforeClass
    public static void setup() {
        MockitoAnnotations.initMocks(UrlBuilderTest.class);
        PowerMockito.mockStatic(Connection.class);
        PowerMockito.when(Connection.class, "toString").thenReturn(INPUT_URL);
    }

    @Test
    public void shouldReturnCorrectUrlWithoutQuery() throws MalformedURLException, URISyntaxException {
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = getUrlBuilder();
        urlBuilder.appendKeyVal(key, value);
        assertEquals(INPUT_URL + "?" + key + "=" + value, new URL(INPUT_URL).toURI().toString());
    }
}

public class UrlBuilder {

    private StringBuilder sb;

    public UrlBuilder() {
        this.sb = new StringBuilder();
    }

    public String appendKeyVal(String key, String value) {
        return sb.append(key).append("=").append(value).append("&").toString();
    }

    public static UrlBuilder getInstance() {
        return new UrlBuilder();
    }

    public URL build() {
        return new URL(sb.toString());
    }

}