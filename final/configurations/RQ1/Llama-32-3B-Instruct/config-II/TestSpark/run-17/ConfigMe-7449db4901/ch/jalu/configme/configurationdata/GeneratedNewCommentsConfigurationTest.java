package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationTest() {
        commentsConfiguration = new CommentsConfiguration();
        assertNull(commentsConfiguration.comments);
    }

}