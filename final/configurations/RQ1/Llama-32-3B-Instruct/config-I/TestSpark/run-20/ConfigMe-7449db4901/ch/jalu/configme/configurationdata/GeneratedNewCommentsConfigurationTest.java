package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void newCommentsConfigurationTest() {
        this.commentsConfig = new CommentsConfiguration();
        assert commentsConfig.comments.isEmpty();
    }

}