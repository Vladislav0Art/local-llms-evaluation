package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void constructor_ReturnsDefaultComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = comments.getComments();
        assertThat(commentsMap, is(Collections.emptyMap()));
    }

    @Test
    public void constructorWithComments_ReturnsCorrectComments() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(map);
        Map<String, List<String>> commentsMap = comments.getComments();
        assertThat(commentsMap, is(map));
    }

    @Test
    public void setComment_ReturnsVoid() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        CommentsConfiguration result = comments.setComment("path", Arrays.asList("line1", "line2"));
        assertNull(result.getComments());
    }

    @Test
    public void getComments_ReturnsMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        comments.setComment("path", Arrays.asList("line1", "line2"));
        Map<String, List<String>> result = comments.getComments();
        assertEquals(expected, result);
    }

    @Test
    public void getAllComments_ReturnsMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        comments.setComment("path", Arrays.asList("line1", "line2"));
        Map<String, List<String>> result = comments.getAllComments();
        assertEquals(expected, result);
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, List<String> lines) {
        comments.put(path, lines);
    }

    public Map<String, List<String>> getAllComments() {
        return comments;
    }

}