package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentOnPathEmpty {

    private Map<String, List<String>> comments;
    private Set<String> paths;

    public void setPaths(Set<String> paths) {
        this.paths = paths;
    }

    public void setComments(List<List<String>> comments) {
        this.comments = new HashMap<>();
        for (List<String> comment : comments) {
            String path = comment.get(0);
            if (!comments.containsKey(path)) {
                comments.put(path, new ArrayList<>());
            }
            ((List<String>) comments.get(path)).add(comment.get(1));
        }
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }

    public void setCommentOnPath(String path, List<String> comment) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        ((List<String>) comments.get(path)).add(comment.get(0));
    }
}

public class CommentsConfigurationTest {

    @Test
    public void testSetCommentOnPathEmpty() {
        Set<String> paths = new HashSet<>();
        Paths paths2 = new HashSet<>();
        paths.add("path1");
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setPaths(paths);
        configuration.setCommentOnPath("", Arrays.asList("comment"));
        Map<String, List<String>> allComments = configuration.getAllComments();
        assert ((List<String>) allComments.get("")).contains("comment");
    }

}