package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void setComment_validPathAndCommentLines_setsCorrectComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "some.path";
        String[] commentLines = new String[]{"comment1", "comment2"};
        config.setComment(path, commentLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = new String[]{"comment1", "comment2"};
        config.setComment(null, commentLines);
    }

    @Test
    public void setComment_nullCommentLines_throwsNullPointerException() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "some.path";
        config.setComment(path, (String[]) null);
    }

    @Test
    public void getAllComments_emptyComments_returnsEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.isEmpty());
    }

}