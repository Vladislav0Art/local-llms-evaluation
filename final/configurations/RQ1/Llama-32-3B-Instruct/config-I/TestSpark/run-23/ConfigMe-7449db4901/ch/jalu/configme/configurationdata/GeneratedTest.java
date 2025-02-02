package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfiguration_testCreatesNewInstance() {
        commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration);
    }

    @Test
    public void newCommentsConfigurationWithExistingCommentsTest_copiesExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertTrue(CommentsConfiguration.class.isAssignableFrom(commentsConfiguration.getClass()));
        assertTrue(commentsConfiguration.getComments() instanceof java.util.Map);
    }

    @Test
    public void setComment_testSetsNewLinesForExistingPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.add("value");
        Map<String, List<String>> existingCommentsMap = new HashMap<>();
        existingCommentsMap.put("key", Arrays.asList("line1", "line2"));
        comments.putAll(existingCommentsMap);
        commentsConfiguration.setComments(comments);
        assertTrue(CommentsConfiguration.class.isAssignableFrom(commentsConfiguration.getClass()));
        assertTrue(comments instanceof java.util.Map);
    }

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