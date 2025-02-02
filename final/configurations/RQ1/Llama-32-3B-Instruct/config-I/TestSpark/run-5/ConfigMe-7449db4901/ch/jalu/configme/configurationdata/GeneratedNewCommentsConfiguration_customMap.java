package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_customMap {

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
    public void newCommentsConfiguration_customMap() throws Exception {
        Map<String, List<String>> customMap = new HashMap<>();
        customMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration comments = new CommentsConfiguration(customMap);
        assertEquals(customMap, comments.getAllComments());
    }

}