package org.jsoup.helper;

import java.util.*;

public class GeneratedTestMakeKey {

    public static String joinPaths(Object... paths) {
        StringBuilder builder = new StringBuilder();
        for (Object path : paths) {
            if (builder.length() > 0) {
                builder.append("/");
            }
            builder.append(path);
        }
        return builder.toString();
    }

    public static Map<String, Object> makeKey(String key, Object... values) {
        return Arrays.stream(values).map(value -> String.valueOf(value)).collect(Collectors.toMap(keyValue -> keyValue, value -> new HashMap<>(), (a, b) -> a));
    }

    public static class KeyVal {
        private final Map<String, Object> map = Collections.synchronizedMap(new HashMap<>());

        public void put(String key, Object value) {
            map.put(key, value);
        }

        public String get(String key) {
            return (String) map.getOrDefault(key, null);
        }
    }

    @Test
    public void testMakeKey() {
        assert makeKey("", Collections.emptyList()) == Collections.emptyMap();
        assert makeKey(null, null, Collections.emptyList()) == Collections.emptyMap();
        assert makeKey("a", Arrays.asList(1, 2), Arrays.asList(3, 4)) == makeKey("a", 1, 2);
    }

}