package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationIsEmpty {

    private static final String VALID_COMMENT_LINES = "Comment1\nComment2";
    private static final String EMPTY_COMMENT_LINES = "\n";

    @Test
    public void newCommentsConfigurationIsEmpty() {
        assertEmpty(getAllComments());
    }

}