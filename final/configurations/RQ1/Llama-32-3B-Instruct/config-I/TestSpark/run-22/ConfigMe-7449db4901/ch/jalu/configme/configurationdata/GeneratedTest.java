package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }
}

class GeneratedTest {

    @Test
    public void testMapCreation() {
        // setup mock objects and calls on them
        Map<String, List<String>> commentsMap = new HashMap<>();

        // check if the map was created with the correct values
        assertThat(commentsMap, equalTo(Map.of()));
    }

    @Test
    public void testMockitoJUnitRunnerClass() {
        // setup mock objects and calls on them
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        CommentsConfiguration allComments = new CommentsConfiguration();

        // check if the class was created with the correct values
        assertThat(allComments, equalTo(commentsConfiguration));
    }

    @Test
    public void testHashMapCreation() {
        // setup mock objects and calls on them
        Map<String, List<String>> commentsMap = new HashMap<>();

        // check if the map was created with the correct values
        assertThat(commentsMap, equalTo(Map.of()));
    }
}

class CommentsConfiguration {

    private static final String COMMENT_KEY = "comment_key";
    private static final String commentValue = "comment_value";

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>();
    }

    public static class MockMap extends HashMap<String, List<String>> {

        @Override
        public void put(String key, Object value) {
            if (value instanceof List) {
                ((List<String>) value).add(commentValue);
            } else {
                throw new RuntimeException("Invalid value type");
            }
            super.put(key, value);
        }

        @Override
        public boolean containsKey(Object key) {
            return containsKey(COMMENT_KEY + key.toString());
        }

        @Override
        public void putAll(Map<? extends String, ?> m) {
            for (Map.Entry<? extends String, ?> entry : m.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override
        public boolean containsValue(Object value) {
            return getValue().equals(commentValue);
        }

        @Override
        public void forEach(Consumer<? super Map.Entry<String, List<String>>> action) {
            for (Map.Entry<String, List<String>> keyEntry : entries()) {
                String key = keyEntry.getKey();
                if (key.startsWith(COMMENT_KEY)) {
                    action.accept(keyEntry);
                }
            }
        }

        @Override
        public boolean containsKey(String key) {
            return super.containsKey(key.replaceFirst(COMMENT_KEY + "_", ""));
        }
    }

}