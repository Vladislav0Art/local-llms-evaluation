package ch.jalu.configme.configurationdata;

public class GeneratedConstructor_ReturnsNewCommentsConfiguration {

    @Test
    public void constructor_ReturnsNewCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getComments());
    }

}