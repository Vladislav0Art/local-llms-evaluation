package org.jsoup.nodes;

public class GeneratedTest {

    private String[] keys;
    private Object[] vals;

    // getters and setters

    public void put(String key, String value) {
        int index = indexOfKey(key);
        if (index == NotFound) {
            addKeyAndValue(key, value);
        } else {
            vals[index] = value;
        }
    }

    public String get(String key) {
        int index = indexOfKey(key);
        return (index != NotFound ? (String) vals[index] : null);
    }

    private static final int NotFound = -1;

    private int indexOfKey(String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return i;
            }
        }
        return NotFound;
    }

    public void addKeyAndValue(String key, String value) {
        String[] newKeys = new String[keys.length + 1];
        Object[] newValue = new Object[vals.length + 1];

        System.arraycopy(keys, 0, newKeys, 0, keys.length);
        System.arraycopy(vals, 0, newValue, 0, vals.length);

        newKeys[keys.length] = key;
        newValue[newValue.length - 1] = value;

        keys = newKeys;
        vals = newValue;
    }

    public int size() {
        return keys.length;
    }
}

public class AttributesTest {

    @Test
    public void testAddAndGetAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        String result = attributes.get("key1");
        assertThat(result, assertEquals("value1"));
    }

    @Test
    public void testDuplicateAttribute() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key1", "new_value1");
        String result1 = attributes.get("key1");
        String result2 = attributes.get("key1");
        assertThat(result1, assertEquals("value1"));
        assertThat(result2, assertEquals("new_value1"));
    }

    @Test
    public void testMultipleAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        int result = attributes.size();
        assertEquals(2, result);
    }

    @Test
    public void testEmptyAttributes() {
        Attributes attributes = new Attributes();
        int result = attributes.size();
        assertEquals(0, result);
    }
}

public class Test {

    @BeforeClass
    public static void beforeClass() {
        Test.mainCalled = true;
    }

    @AfterAll
    public static void afterAll() {
        // do nothing
    }

    @Test
    public void testAll() {
        AttributesTest test1 = new AttributesTest();
        test1.testAddAndGetAttribute();
        test1.testDuplicateAttribute();
        test1.testMultipleAttributes();
        test1.testEmptyAttributes();

        if (mainCalled) return;

        throw new RuntimeException("All tests failed");
    }

    private static class Assert {

        public interface Matcher<T> {
            boolean matches(T actual);
        }

        public static <T> Matcher<T> equals(Object expected, T actual) {
            return new EqualsMatcher<>(expected, actual);
        }

        public static void assertEquals(int expected, int actual) {
            assertThat(actual, equals(expected));
        }
    }

    private static class EqualsMatcher<T> implements Matcher<T> {

        private final T expected;
        private final T actual;

        public EqualsMatcher(T expected, T actual) {
            this.expected = expected;
            this.actual = actual;
        }

        @Override
        public boolean matches(T actual) {
            return Objects.equals(expected, actual);
        }
    }

    private static class That {

        private final Matcher<?> matcher;

        public That(Matcher<?> matcher) {
            this.matcher = matcher;
        }

        public static <T> That equals(Object expected, T actual) {
            return new EqualsThat<>(equals(expected));
        }

        private static class EqualsThat<T> implements Matcher<T> {

            private final Matcher<T> matcher;

            public EqualsThat(Matcher<T> matcher) {
                this.matcher = matcher;
            }

            @Override
            public boolean matches(T actual) {
                return matcher.matches(actual);
            }
        }
    }

    private static class ThatAsserts {

        private static void assertThat(String message, Matcher<?> matcher) {
            if (!matcher.matches()) {
                throw new AssertionError(message);
            }
        }

        public static <T> void assertThat(T actual, Matcher<T> expectedMatcher) {
            Matcher<T> matcher = expectedMatcher;
            assertThat("Expected " + matcher, matcher);
        }

        private static class EqualsThat {

            private final Matcher<?> matcher;

            public EqualsThat(Matcher<?> matcher) {
                this.matcher = matcher;
            }

            @Override
            public boolean matches(Object actual) {
                return matcher.matches(actual);
            }
        }
    }

}