package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> comments;

    public void setComments(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }
}

public class TestCommentsConfiguration {

    @Test
    public void testSetGetComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        expectedComments.put("path2", Arrays.asList("comment2"));
        config.setComments(expectedComments);
        assertEquals(expectedComments, config.getComments());
    }

    @Test
    public void testSetGetSinglePath() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        config.setComments(expectedComments);
        assertEquals(1, config.getComments().size());
        assertEquals("comment1", config.getComments().get("path1").get(0));
    }

    @Test
    public void testSetGetMultiplePaths() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        expectedComments.put("path2", Arrays.asList("comment2"));
        config.setComments(expectedComments);
        assertEquals(2, config.getComments().size());
    }

    @Test
    public void testGetAllPaths() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        expectedComments.put("path2", Arrays.asList("comment2"));
        config.setComments(expectedComments);
        assertEquals(2, config.getAllPaths().size());
    }

    @Test
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        expectedComments.put("path2", Arrays.asList("comment2"));
        config.setComments(expectedComments);
        assertEquals(4, config.getAllComments().size());
    }

}