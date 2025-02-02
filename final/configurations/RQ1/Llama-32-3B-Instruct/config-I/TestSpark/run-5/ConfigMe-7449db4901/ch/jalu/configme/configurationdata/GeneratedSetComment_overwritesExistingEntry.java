package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_overwritesExistingEntry {

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
    public void setComment_overwritesExistingEntry() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration comments = new CommentsConfiguration(map);
        comments.setComment("path1", "newComment");
        assertEquals(Collections.singletonList("newComment"), comments.getComments().get("path1"));
    }

}