package org.jsoup.helper;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuild_urlWithQuery {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static KeyVal of(String key, String value) {
            return new KeyVal(key, value);
        }
    }

}

@RunWith(MockitoJUnitRunner.class)
public class UrlBuilderTest {

    @Mock
    private org.junit.runner.Description description;

    @Mock
    private Connection connection;

    @Before
    public void setup() {
        // given
        URL inputUrl = new URL("https://www.example.com");
        // when
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        // then
        Mockito.verify(urlBuilder).inputUrl();
        org.junit.Assert.assertNotNull(urlBuilder);
        org.junit.Assert.assertEquals(inputUrl, urlBuilder.inputUrl());
    }

    @Test
    public void testBuild_urlWithQuery() {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        // when
        String result = urlBuilder.build("key=value");
        // then
        assertEquals("https://www.example.com?key=value", result);
    }

}