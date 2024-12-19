package org.jsoup.helper;

public class GeneratedTest {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    public static KeyVal createKeyVal(String key, String value) {
        return new KeyVal(key, value);
    }

    public static ListConnection.KeyVal>

    createQueryParams(KeyVal... kv) {
        ListConnection.KeyVal > queryParams = new ArrayList > ();
        for (Connection.KeyVal cv : kv) {
            queryParams.add(cv);
        }
        return queryParams;
    }

    public static String generateUrl(String url, int portNumber) {
        return url.replace("8080", String.valueOf(portNumber));
    }
}

public class UrlBuilderTest {

}