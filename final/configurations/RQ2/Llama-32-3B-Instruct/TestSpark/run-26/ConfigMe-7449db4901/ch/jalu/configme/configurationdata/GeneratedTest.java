package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> allComments = new HashMap<>();

    public void setComment(String path, String... lines) {
        if (!allComments.containsKey(path)) {
            allComments.put(path, new ArrayList<>());
        }
        Collections.addAll(allComments.get(path), Arrays.asList(lines));
    }

    public Map<String, List<String>> getAllComments() {
        return allComments;
    }
}

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfigurationHasNoEntriesWhenCreatedFromClass() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(2, config.getAllComments().get("test").size());
    }

    @Test
    public void setCommentSetsPathAsKey() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals("test", config.getAllComments().keySet().iterator().next());
    }

    @Test
    public void setCommentAddsLinesToPathIfItDoesNotExist() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(2, config.getAllComments().get("test").size());
    }

}