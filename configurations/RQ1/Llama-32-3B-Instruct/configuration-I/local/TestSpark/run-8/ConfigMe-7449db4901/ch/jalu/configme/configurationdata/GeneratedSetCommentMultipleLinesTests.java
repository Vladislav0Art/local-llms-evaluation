package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentMultipleLinesTests {

    public static Map<String, List<String>> getComments(CommentsConfiguration commentsConfiguration) {
        return commentsConfiguration.getComments();
    }

    public static boolean isNotEmpty(Map<String, List<String>> map) {
        for (List<String> list : map.values()) {
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static int getCommentSize(String path, Map<String, List<String>> map) {
        return map.get(path).size();
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, String comment) {
        if (path.isEmpty()) {
            comments.clear();
        } else {
            comments.put(path, Arrays.asList(comment));
        }
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }
}

public class CommentsConfigurationTest {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void setCommentMultipleLinesTests() {
        commentsConfiguration.setComment("path1", "line1\nline2");
        assertEquals(2, commentsConfiguration.getComments().get("path1").size());
    }

}