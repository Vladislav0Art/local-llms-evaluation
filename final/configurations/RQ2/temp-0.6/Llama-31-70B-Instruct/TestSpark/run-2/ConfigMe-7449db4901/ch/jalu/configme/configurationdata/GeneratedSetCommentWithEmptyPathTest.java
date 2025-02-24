package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyPathTest() {
        commentsConfiguration.setComment("", "comment");
    }

}