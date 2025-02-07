package org.jsoup.nodes;

public class GeneratedTest {

    private Map<String, Object> data = new AbstractMap<>();
    private int index;

    public String get(String key) {
        return checkNotNull(data.get(key));
    }

    public String getIgnoreCase(String key) {
        return checkNotNull(get(key).toLowerCase());
    }

    @Nullable
    public Object getUserData(String key) {
        return data.get(key);
    }

    public Attributes add(String key, @Nullable String value) {
        data.put(key, value != null ? value : checkNull(value));
        index++;
        return this;
    }

    public Attributes put(String key, @Nullable String value) {
        if (value == null) {
            data.remove(key);
        } else {
            data.put(key, value);
        }
        index++;
        return this;
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributesImpl that = (AttributesImpl) o;

        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (Object pair : data.entrySet()) {
            if (pair instanceof Map.Entry<?, ?>) {
                String key = ((Map.Entry<?, ?>) pair).getKey().toString();
                Object value = ((Map.Entry<?, ?>) pair).getValue();
                if (value == null || !(value instanceof String)) continue;
                result = prime * result + lowerCase(key).hashCode();
            }
        }
        return prime ^ result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(entry.getKey()).append("=").append(checkNotNull(entry.getValue()));
        }
        return sb.toString();
    }

    @Override
    public boolean clone() {
        try {
            AttributesImpl copy = new AttributesImpl();
            copy.data = new AbstractMap.SimpleEntry<>(data);
            copy.index = index;
            return copy;
        } catch (Exception e) {
            return false;
        }
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public Iterator<Attribute> iterator() {
        return new AttributesIterator();
    }

    private class AttributesIterator implements Iterator<Attribute> {
        final Map<String, Object> data = new AbstractMap.SimpleImmutableMap<>();
        int index = 0;

        @Override
        public boolean hasNext() {
            return !data.isEmpty();
        }

        @Override
        public Attribute next() {
            return new AttributesImpl.DataEntry(data.get(index++), Objects.toString(getValue()));
        }

        private String getValue() {
            if (index < data.size()) return data.get(index).toString().toLowerCase();
            return null;
        }
    }

    public static class DataEntry implements Iterable<String> {
        private final Object value;

        public DataEntry(Object value, String string) {
            this.value = value;
            this.string = string;
        }

        @Override
        public Iterator<String> iterator() {
            return new AttributesIterator();
        }

        public static String internalKey(String key) {
            return lowerCase(key);
        }
    }
}

public class AttributesTest {
    private static final String internalString1 = "value1";
    private static final String internalString2 = "value2";

    @Test
    public void testGet() {
        AttributesImpl attributes = new AttributesImpl();
        System.out.println(attributes.get("key"));
        System.out.println(AttributesImpl.internalKey(attributes.get("key")));
    }

    @Test
    public void testGetIgnoreCase() {
        AttributesImpl attributes = new AttributesImpl();
        System.out.println(AttributesImpl.internalKey(attributes.getIgnoreCase("key")));
    }

    @Test
    public void testGetValue() {
        AttributesImpl attributes = new AttributesImpl();
        attributes.add(internalString1, internalString2);
        System.out.println(AttributesImpl internallyInternalKey(AttributesImpl.internalKey(internalString1)));
    }

}