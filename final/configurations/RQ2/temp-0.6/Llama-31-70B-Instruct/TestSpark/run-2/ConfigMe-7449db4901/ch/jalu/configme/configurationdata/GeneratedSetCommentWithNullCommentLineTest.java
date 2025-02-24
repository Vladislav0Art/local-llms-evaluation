package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNullCommentLineTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullCommentLineTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String) null));
    }

}