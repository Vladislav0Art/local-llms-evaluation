package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationWithExistingCommentsTest_copiesExistingComments {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationWithExistingCommentsTest_copiesExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertTrue(CommentsConfiguration.class.isAssignableFrom(commentsConfiguration.getClass()));
        assertTrue(commentsConfiguration.getComments() instanceof java.util.Map);
    }

}