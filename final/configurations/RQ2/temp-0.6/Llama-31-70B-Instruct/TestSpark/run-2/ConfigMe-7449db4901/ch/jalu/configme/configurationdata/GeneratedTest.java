package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullPathTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, ""));
    }

    @Test
    public void setCommentWithNullCommentLinesTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String[]) null));
    }

    @Test
    public void setCommentWithNullCommentLineTest() {
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String) null));
    }

    @Test
    public void setCommentWithEmptyPathTest() {
        commentsConfiguration.setComment("", "comment");
    }

    @Test
    public void setCommentWithEmptyCommentLinesTest() {
        String[] commentLines = new String[0];
        commentsConfiguration.setComment("path", commentLines);
    }

    @Test
    public void setCommentWithEmptyCommentLineTest() {
        String[] commentLines = new String[]{""};
        commentsConfiguration.setComment("path", commentLines);
    }

    @Test
    public void setCommentWithNormalParametersTest() {
        String[] commentLines = new String[]{"comment"};
        commentsConfiguration.setComment("path", commentLines);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
    }

}