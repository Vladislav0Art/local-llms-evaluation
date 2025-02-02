package ch.jalu.configme.configurationdata;

public class GeneratedSetMultipleCommentsForSamePathTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void setMultipleCommentsForSamePathTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "line1");
        this.commentsConfig.setComment("path2", "line2");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.contains("line1"));
    }

}