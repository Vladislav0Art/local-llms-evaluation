package org.jsoup.helper;

public class GeneratedNewUrlBuilder_withValidInputUrl {

    private String key;
    private String value;

    public KeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class Connection implements KeyVal {
    private String key;
    private String value;

    public Connection(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class UrlBuilderTest {

    @Test
    public void newUrlBuilder_withValidInputUrl() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder();
        Mockito.when(urlBuilder.build()).thenReturn(null);
        Mockito.assertDoesNotThrow(() -> urlBuilder.build());
    }

}