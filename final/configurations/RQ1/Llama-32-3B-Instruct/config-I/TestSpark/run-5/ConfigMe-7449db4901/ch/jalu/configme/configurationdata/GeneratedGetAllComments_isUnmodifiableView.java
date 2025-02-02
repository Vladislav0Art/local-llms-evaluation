package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_isUnmodifiableView {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
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

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(this.comments);
    }
}

public class CommentsConfigurationTest {

    @Test
    public void getAllComments_isUnmodifiableView() throws Exception {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration comments = new CommentsConfiguration(map);
        Map<String, List<String>> unmodifiableMap = comments.getAllComments();
        assertTrue(unmodifiableMap instanceof UnmodifiableMap);
    }

}