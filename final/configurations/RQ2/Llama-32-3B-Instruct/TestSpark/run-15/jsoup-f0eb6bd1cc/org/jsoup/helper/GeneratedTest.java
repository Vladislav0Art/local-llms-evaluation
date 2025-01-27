package org.jsoup.helper;

public class GeneratedTest {

    private String key;
    private String value;

    public static class Builder {
        private String key;
        private String value;

        public Builder(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static Builder a(String key, String value) {
            return new Builder(key, value);
        }
    }

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

    public static class Builder {
        private String key;
        private String value;

        public Builder(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public static Builder a(String key, String value) {
            return new Builder(key, value);
        }
    }

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

}