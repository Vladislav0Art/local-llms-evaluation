package ch.jalu.configme.configurationdata;

public class GeneratedTestSetGetSinglePath {

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
    public void testSetGetSinglePath() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1"));
        config.setComments(expectedComments);
        assertEquals(1, config.getComments().size());
        assertEquals("comment1", config.getComments().get("path1").get(0));
    }

}