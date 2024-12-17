package org.jsoup.helper;

public class GeneratedTestCreateQueryParams {

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
    public void testCreateQueryParams() {
        // Given
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        // When
        Connection.KeyVal kv1 = ConnectionHelper.createKeyVal(key1, value1);
        Connection.KeyVal kv2 = ConnectionHelper.createKeyVal(key2, value2);

        // Then
        assertEquals("key1=value1", kv1.toString());
        assertEquals("key2=value2", kv2.toString());
    }

}