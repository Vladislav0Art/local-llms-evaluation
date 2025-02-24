package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyCommentLineTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyCommentLineTest() {
        String[] commentLines = new String[]{""};
        commentsConfiguration.setComment("path", commentLines);
    }

}