package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

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
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        expectedComments.put("path2", Arrays.asList("comment2"));
        config.setComments(expectedComments);
        assertEquals(4, config.getAllComments().size());
    }

}