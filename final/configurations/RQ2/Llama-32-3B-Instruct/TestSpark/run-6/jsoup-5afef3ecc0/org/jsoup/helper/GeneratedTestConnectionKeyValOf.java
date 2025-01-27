package org.jsoup.helper;

public class GeneratedTestConnectionKeyValOf {

    public static KeyVal<String, String> of(String key, String value) {
        return new KeyVal<>(key, value);
    }

    public static class KeyVal<K, V> implements Comparable<KeyVal<K, V>> {
        private K key;
        private V value;

        public KeyVal(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(KeyVal other) {
            return Objects.compare(this.key, other.key);
        }
    }
}

public class URIUtils {
    public static URI of(String scheme, String authority, String path, String query, String fragment) {
        return new URI(scheme, authority, path, query, fragment);
    }

    public static URI of(String url) {
        URI uri = new URI(url);
        return uri;
    }
}

public class Connection {
    private final Map<String, KeyVal<String, String>> data;

    public Connection() {
        this.data = new HashMap<>();
    }

    public void put(String key, String value) {
        data.put(key, new ConnectionKeyVal<>(key, value));
    }

    public KeyVal<String, String> get(String key) {
        return data.get(key);
    }
}

public class TestConnectionKeyValUtils {

    @Test
    public void testConnectionKeyValOf() {
        Connection connection = new Connection();
        KeyVal<String, String> kv = ConnectionKeyVal.of("key", "value");
        assertEquals(kv.key(), "key");
        assertEquals(kv.value(), "value");
    }

}