package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCommentsConfiguration {

    @Test
    public void testCommentsConfiguration() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertTrue(commentsConfiguration.getPaths().containsAll(Arrays.asList("line1", "line2")));
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> paths;

    public CommentsConfiguration(Map<String, List<String>> commentMap) {
        this.paths = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : commentMap.entrySet()) {
            this.paths.put(entry.getKey(), UnmodifiableView.unmodifiable((List<String>) entry.getValue()));
        }
    }

    public Map<String, List<String>> getPaths() {
        return paths;
    }
}

public class UnmodifiableView {
    private static class Entry {
        String key;
        List<String> value;

        Entry(String key, List<String> value) {
            this.key = key;
            this.value = value;
        }
    }

    public static final class UnmodifiableList extends java.util.List {
        private final java.util.ArrayList list;

        UnmodifiableList(java.util.List list) {
            this.list = new java.util.ArrayList(list);
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public Object get(int index) {
            return list.get(index);
        }
    }

    public static final class UnmodifiableView {
        private static class Entry extends java.util.Map.Entry {
            String key;
            List<String> value;

            Entry(String key, List<String> value) {
                this.key = key;
                this.value = value;
            }
        }

        public static final class UnmodifiableMap extends java.util.Map {
            private final java.util.HashMap map;

            UnmodifiableMap(java.util.Map map) {
                this.map = new java.util.HashMap(map);
            }

            @Override
            public int size() {
                return map.size();
            }

            @Override
            public boolean containsKey(Object key) {
                return map.containsKey(key);
            }

            @Override
            public Object get(Object key) {
                return map.get(key);
            }
        }

        public static final class UnmodifiableList extends java.util.List {
            private final java.util.ArrayList list;

            UnmodifiableList(java.util.List list) {
                this.list = new java.util.ArrayList(list);
            }

            @Override
            public int size() {
                return list.size();
            }

            @Override
            public boolean isEmpty() {
                return list.isEmpty();
            }
        }
    }

}