package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCommentsConfigurationUnmodifiableView {

    @Test
    public void testCommentsConfigurationUnmodifiableView() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);

        assertTrue(commentsConfiguration.getPaths().containsAll(Arrays.asList("line1", "line2")));
    }
}

class UnmodifiableView {
    public static <T> Class<T> unmodifiable() {
        return List.class;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] unmodifiable(T[] array) {
        return (T[]) array.clone();
    }
}

class CommentsConfiguration {
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