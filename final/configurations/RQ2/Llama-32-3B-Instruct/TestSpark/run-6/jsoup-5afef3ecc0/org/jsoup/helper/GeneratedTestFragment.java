package org.jsoup.helper;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

public class GeneratedTestFragment {

    @Test
    public void testFragment() throws Exception {
        String url = "https://example.com?query=hello#fragment";
        URI uri = new URI(url);
        String fragment = uri.getFragment();
        assertThat(fragment, CoreMatchers.equalTo("fragment"));
    }
}

public class ConnectionKeyVal {

    public static <K, V> Connection.KeyVal<K, V> of(K key, V value) {
        return (k, v) -> { /* implementation */ };
    }

    public static void main(String[] args) {
        Connection<KeyVal<String, String>> connection = new Connection<>();
        KeyVal<String, String> kv = Connection.KeyVal.of("key", "value");
        System.out.println(kv);
    }
}

public class URIUtils {

    public static String getQuery(URI uri) {
        return uri.getQuery();
    }

    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://example.com?a=1&b=2");
        System.out.println(getQuery(uri));
    }
}

public class Connection {

    public interface KeyVal<K, V> {
        String toString();
    }

    public static <K, V> KeyVal<K, V> of(K key, V value) {
        return (k, v) -> { /* implementation */ };
    }

}