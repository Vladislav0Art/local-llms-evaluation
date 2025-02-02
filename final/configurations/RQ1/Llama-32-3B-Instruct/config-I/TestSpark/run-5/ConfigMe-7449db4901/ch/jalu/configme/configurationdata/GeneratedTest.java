package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> comments;

    public static CommentsConfiguration newCommentsConfiguration() {
        return new CommentsConfiguration();
    }

    public void setComment(String path, String comment) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(comment);
    }

    public Map<String, List<String>> getComments() {
        return Collections.unmodifiableMap(comments);
    }

    public static Map<String, List<String>> newCommentsConfiguration(Map<String, List<String>> customMap) {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.comments = customMap;
        return comments.getComments();
    }
}

public class CommentsConfigurationTest {

}