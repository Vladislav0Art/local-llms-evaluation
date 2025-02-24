package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNormalParametersTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNormalParametersTest() {
        String[] commentLines = new String[]{"comment"};
        commentsConfiguration.setComment("path", commentLines);
    }

}