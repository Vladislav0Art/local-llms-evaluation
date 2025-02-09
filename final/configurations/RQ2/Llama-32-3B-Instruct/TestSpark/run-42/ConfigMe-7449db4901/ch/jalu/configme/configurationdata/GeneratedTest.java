package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void testSetPaths() {
        Set<String> paths = new HashSet<>();
        paths.add("path1");
        paths.add("path2");
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setPaths(paths);
        assert configuration.paths.equals(paths);
    }

    @Test
    public void testSetComments() {
        List<List<String>> comments = new ArrayList<>();
        comments.add(Arrays.asList("path1", "comment1"));
        comments.add(Arrays.asList("path2", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComments(comments);
        Map<String, List<String>> allComments = configuration.getAllComments();
        assert allComments.size() == 2;
    }

    @Test
    public void testSetCommentOnPath() {
        Set<String> paths = new HashSet<>();
        paths.add("path1");
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setPaths(paths);
        configuration.setCommentOnPath("path1", Arrays.asList("comment"));
        Map<String, List<String>> allComments = configuration.getAllComments();
        assert ((List<String>) allComments.get("path1")).contains("comment");
    }

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

    @Test
    public void testGetAllComments() {
        Set<String> paths = new HashSet<>();
        paths.add("path1");
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setPaths(paths);
        configuration.setCommentOnPath("path1", Arrays.asList("comment"));
        Map<String, List<String>> allComments = configuration.getAllComments();
        assert ((List<String>) allComments.get("path1")).contains("comment");
    }

}