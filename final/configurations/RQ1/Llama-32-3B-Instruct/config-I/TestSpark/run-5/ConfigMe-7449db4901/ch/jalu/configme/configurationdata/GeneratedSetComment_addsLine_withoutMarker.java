package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_addsLine_withoutMarker {

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
    public void setComment_addsLine_withoutMarker() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", "\n\n");
        assertNotNull(comments.getComments().get("path1"));
    }

}