package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComment {

    private Map<String, List<String>> comments;

    public CommentConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String path, String comment) {
        if (comment == null || comment.isEmpty()) {
            throw new NullPointerException("Comment cannot be null or empty");
        }
        comments.putIfAbsent(path, new ArrayList<>());
        comments.get(path).add(comment);
    }

    public List<String> getComment(String path) {
        return comments.getOrDefault(path, Collections.emptyList());
    }

}

public class CommentConfigurationTest {

    @Test
    public void testGetComment() {
        var commentConfiguration = new CommentConfiguration();
        commentConfiguration.setComment("path1", "comment1");
        assertEquals(1, commentConfiguration.getComment("path1").size());
    }

}