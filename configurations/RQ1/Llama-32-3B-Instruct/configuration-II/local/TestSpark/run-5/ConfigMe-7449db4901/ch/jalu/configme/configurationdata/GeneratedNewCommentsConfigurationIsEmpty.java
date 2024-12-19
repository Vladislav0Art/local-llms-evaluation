package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationIsEmpty {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationIsEmpty() {
        Assertions.assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}