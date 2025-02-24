package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNullCommentLinesTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullCommentLinesTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String[]) null));
    }

}