package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void CommentsConfigurationConstructorNoComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(0, commentsConfiguration.comments.size());
    }

    @Test
    public void CommentsConfigurationConstructorWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Collections.singletonList("line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(2, commentsConfiguration.comments.size());
    }

    @Test
    public void setCommentNoEmptyLines() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path1";
        String...commentLines = {"line1", "\nline2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setCommentWithEmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path1";
        String...commentLines = {"line1", ""};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setCommentWithMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path1";
        String...commentLines = {"line1", "\nline2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setCommentWithMultipleEmptyLines() {
        Map<String, List<String>> comments = new HashMap<>();
        String path = "path1";
        String...commentLines = {"line1", ""};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void getAllCommentsNoComments() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void getAllCommentsWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        String path1 = "path1";
        String...commentLines1 = {"line1", "\nline2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.singletonMap("path1", Collections.singletonList(commentLines1)));
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void getAllCommentsWithEmptyPaths() {
        Map<String, List<String>> comments = new HashMap<>();
        String path2 = "path2";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.singletonMap("path2", Collections.emptyList()));
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}