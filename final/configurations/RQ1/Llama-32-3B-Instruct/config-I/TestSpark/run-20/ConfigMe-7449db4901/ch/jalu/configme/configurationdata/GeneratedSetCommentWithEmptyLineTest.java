package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyLineTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void setCommentWithEmptyLineTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "\n");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.isEmpty());
    }

}