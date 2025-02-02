package ch.jalu.configme.configurationdata;

public class GeneratedGetComments_testReturnsMap {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getComments_testReturnsMap() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("key", Arrays.asList("line1", "line2"));
        commentsConfiguration.setComments(expectedComments);
        assertTrue(CommentsConfiguration.class.isAssignableFrom(commentsConfiguration.getClass()));
        assertTrue(commentsConfiguration.getComments() instanceof java.util.Map);
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public void setComments(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

}