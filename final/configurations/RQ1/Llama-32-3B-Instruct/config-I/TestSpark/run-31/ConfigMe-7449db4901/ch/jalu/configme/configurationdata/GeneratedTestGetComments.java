package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComments {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = new java.util.HashMap<>(comments);
    }

    public void setComment(String path, String before, String after) {
        if (before.isEmpty()) {
            this.comments.computeIfAbsent(path, k -> new ArrayList<>()).add(after);
        } else {
            this.comments.computeIfAbsent(path, k -> new ArrayList<>()).add(before + "\n" + after);
        }
    }

    public java.util.Map<String, java.util.List<String>> getComments() {
        return java.util.Collections.unmodifiableMap(this.comments);
    }

    public static boolean isInitializedWithEmptyMap(CommentsConfiguration config) {
        return java.util.Collections.isEmpty(config.getComments());
    }

    public static int testSetComment(CommentsConfiguration config) {
        config.setComment("path1", "", "line1");
        return config.getComments().size();
    }

    public static int testMultipleSetComment(CommentsConfiguration config) {
        config.setComment("path2", "before2", "line2");
        config.setComment("path3", "", "line3");
        return config.getComments().size();
    }

    public static boolean testGetComments(CommentsConfiguration config) {
        config.setComment("path1", "", "line1");
        return config.getComments().size() == 1;
    }
}

public class GeneratedTest {

    @Test
    public void testGetComments() {
        CommentsConfiguration config = new CommentsConfiguration(java.util.Collections.singletonMap("path1", java.util.Arrays.asList("line1")));
        assertTrue(CommentsConfiguration.testGetComments(config));
    }

}