package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNullPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullPathTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, ""));
    }

}