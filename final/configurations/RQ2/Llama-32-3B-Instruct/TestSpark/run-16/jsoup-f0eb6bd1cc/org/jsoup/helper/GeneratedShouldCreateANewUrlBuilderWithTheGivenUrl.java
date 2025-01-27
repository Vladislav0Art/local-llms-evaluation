package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

public class GeneratedShouldCreateANewUrlBuilderWithTheGivenUrl {

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
    public void shouldCreateANewUrlBuilderWithTheGivenUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = getUrlBuilder();
        assertNotNull(urlBuilder);
        assertEquals(INPUT_URL, urlBuilder.toString());
    }

}