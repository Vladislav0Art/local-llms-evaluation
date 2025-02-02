package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsShouldReturnUnmodifiableMap {

    private Map<String, List<String>> comments;

    @PublicConstructor
    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    @PublicMethod
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    @PublicMethod
    public void setComment(String path, String[] lines) {
        if (lines == null || lines.length == 0) {
            lines = new String[0];
        }
        comments.put(path, Arrays.asList(lines));
    }
}

public class GeneratedTest {

    @Test
    public void getAllCommentsShouldReturnUnmodifiableMap() {
        CommentsConfiguration c = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> map = c.getAllComments();
        assertFalse(map.isMutable());
    }

}