package org.jsoup.helper;

public class GeneratedTestCreateKeyVal {

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

    public static Connection.KeyVal createQueryParams(KeyVal... kv) {
        ListConnection.KeyVal > queryParams = new ArrayList > ();
        for (KeyVal kv1 : kv) {
            queryParams.add(kv1);
        }
        return new Connection.KeyVal(queryParams);
    }

    public static String generateUrl(String url, int portNumber) {
        return url.replace("8080", String.valueOf(portNumber));
    }
}

public class UrlBuilderTest {

    @Test
    public void testCreateKeyVal() {
        // Given
        String key = "key";
        String value = "value";

        // When
        Connection.KeyVal kv = ConnectionHelper.createKeyVal(key, value);

        // Then
        assertEquals(key, kv.getKey());
        assertEquals(value, kv.getValue());
    }

}