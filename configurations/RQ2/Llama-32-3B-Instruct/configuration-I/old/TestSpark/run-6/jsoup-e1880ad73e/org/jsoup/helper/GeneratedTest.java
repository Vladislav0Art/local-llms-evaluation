package org.jsoup.helper;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    public static class KeyVal {
        private String key;
        private String val;

        public Connection.KeyVal(
        String key, String
        val)

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

    public static class ConnectionBuilder {
        private String key;
        private String val;

        public ConnectionBuilder(String key, String val) {
            setKey(key);
            setVal(val);
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public Connection.KeyVal getKeyVal() {
            return new Connection.KeyVal(key, val);
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

}