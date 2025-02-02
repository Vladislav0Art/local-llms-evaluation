package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_testCreatesNewInstance {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfiguration_testCreatesNewInstance() {
        commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration);
    }

}