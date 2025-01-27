package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnection_put {

    public static URI of(String scheme, String authority, String path, String query, String fragment) {
        return new URI(scheme + ":" + authority + path + "?" + query + "#" + fragment);
    }

    public static URI of(String url) {
        return new URI(url);
    }
}

public class Connection {

    private final Map<String, KeyVal<String, String>> data = new HashMap<>();

    public KeyVal<String, String> get(String key) {
        return data.get(key);
    }

    public void put(String key, String value) {
        this.data.put(key, new KeyVal<>(key, value));
    }
}

public class KeyVal<K, V> {

    private final K key;
    private final V value;

    public KeyVal(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> KeyVal<K, V> of(String key, String value) {
        return new KeyVal<>(key, value);
    }
}

public class URIUtilsTest {

    @Test
    public void testConnection_put() {
        Connection connection = new Connection();
        KeyVal<String, String> keyVal = connection.put("key", "value");
        assertEquals("value", keyVal.getValue());
    }

}