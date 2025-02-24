package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyCommentLinesTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyCommentLinesTest() {
        String[] commentLines = new String[0];
        commentsConfiguration.setComment("path", commentLines);
    }

}