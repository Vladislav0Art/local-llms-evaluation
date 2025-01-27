package org.jsoup.helper;

public class GeneratedTest {

    private Map<String, String> data = new HashMap<>();

    public String get(String key) {
        return data.get(key);
    }

    public void put(String key, String value) {
        this.data.put(key, value);
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

public class URIUtils {

    public static URI of(String scheme, String authority, String path, String query, String fragment) {
        return new URI(scheme + ":" + authority + path + "?" + query + "#" + fragment);
    }

    public static URI of(String url) {
        try {
            return new URI(url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class URIUtilsTest {

}