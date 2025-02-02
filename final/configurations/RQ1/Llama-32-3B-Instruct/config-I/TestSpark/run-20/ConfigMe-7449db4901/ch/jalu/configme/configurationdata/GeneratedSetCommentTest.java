package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void setCommentTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "line1");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.contains("line1"));
    }

}