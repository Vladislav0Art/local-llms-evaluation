package org.jsoup.helper;

@RunWith(PowerMockRunner.class)
public class GeneratedTestURLEquals {

    public static class KeyVal {
        private String key;
        private String val;

        public Connection.KeyVal()

        {
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public String getKey() {
            return key;
        }

        public String getVal() {
            return val;
        }
    }
}

public class URL {
    private String url;

    public URL() {
    }

    public URL(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URL url1 = (URL) o;
        return Objects.equals(url, url1.url);
    }
}

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    @Test
    public void testURLEquals() {
        String inputUrl = "http://www.example.com";
        URL urlBuilder = new URL(inputUrl);

        assertEquals(inputUrl, urlBuilder.getUrl());
    }

}