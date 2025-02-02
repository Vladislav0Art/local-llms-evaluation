package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void constructor_ReturnsNewCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getComments());
    }

    @Test
    public void constructorWithExistingComments_ReturnsExistingCommentsConfiguration() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, commentsConfiguration.getComments());
    }

    @Test
    public void setComment_SetCommentsForPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        List<String> commentLines = commentsConfiguration.getComments().get("path");
        assertEquals(Arrays.asList("line1", "line2"), commentLines);
    }

    @Test
    public void setComment_EmptyLineResultsInEmptyLineWithoutCommentMarker() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String line = "\n";
        commentsConfiguration.setComment("path", line, "line2");
        List<String> commentLines = commentsConfiguration.getComments().get("path");
        assertEquals(Arrays.asList("line2"), commentLines);
    }

    @Test
    public void setComment_MultiplePathsSupported() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        String path2 = "path2";
        String line2 = "line2";
        commentsConfiguration.setComment(path1, line1);
        commentsConfiguration.setComment(path2, line2);
        Map<String, List<String>> commentLines = commentsConfiguration.getComments();
        assertEquals(2, commentLines.size());
    }

    @Test
    public void getAllComments_ReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        commentsConfiguration.setComment(path1, line1);
        Map<String, List<String>> commentLines = commentsConfiguration.getAllComments();
        assertTrue(commentLines instanceof Map);
    }

    @Test
    public void getAllComments_ReturnsUnmodifiableList() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        commentsConfiguration.setComment(path1, line1);
        List<String> commentLines = commentsConfiguration.getAllComments().get(path1);
        assertTrue(commentLines instanceof List);
    }

}