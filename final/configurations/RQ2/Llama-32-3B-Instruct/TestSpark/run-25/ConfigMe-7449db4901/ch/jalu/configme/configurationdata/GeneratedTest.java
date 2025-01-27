package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private java.util.Map<String, List<String>> allComments;

    public java.util.Map<String, List<String>> getAllComments() {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
        return this.allComments;
    }

    public void setComment(String path, String[] commentLines) {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
        List<String> lines = Arrays.asList(commentLines);
        this.allComments.put(path, lines);
    }
}

public class CommentsConfigurationTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void existingCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void setCommentWithEmptyLineResultsInEmptyLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path/to/line";
        String[] commentLines = {""};
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().get(path).isEmpty());
    }

    @Test
    public void setCommentWithMultipleLinesResultsInCorrectlyRegisteredEntries() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path/to/line";
        String[] commentLines = {"one", "two"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("one", "two"), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setCommentOveridesExistingEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        String path = "path/to/line";
        String[] commentLines = {"existing", "new"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("new"), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setMultiplePathsResultsInCorrectlyRegisteredEntries() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path/to/line1";
        String[] commentLines1 = {"one"};
        String path2 = "path/to/line2";
        String[] commentLines2 = {"two"};
        commentsConfiguration.setComment(path1, commentLines1);
        commentsConfiguration.setComment(path2, commentLines2);
        assertEquals(Arrays.asList("one", "two"), commentsConfiguration.getAllComments());
    }

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().size() == 0);
    }

    @Test
    public void existingCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        assertTrue(commentsConfiguration.getAllComments().size() == 0);
    }

    @Test
    public void setCommentWithEmptyLineResultsInEmptyLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path/to/line";
        String[] commentLines = {""};
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
    }

    @Test
    public void setCommentWithMultipleLinesResultsInCorrectlyRegisteredEntries() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path/to/line";
        String[] commentLines = {"one", "two"};
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
    }

    @Test
    public void setCommentOveridesExistingEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        String path = "path/to/line";
        String[] commentLines = {"existing", "new"};
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
    }

    @Test
    public void setMultiplePathsResultsInCorrectlyRegisteredEntries() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path/to/line1";
        String[] commentLines1 = {"one"};
        String path2 = "path/to/line2";
        String[] commentLines2 = {"two"};
        commentsConfiguration.setComment(path1, commentLines1);
        commentsConfiguration.setComment(path2, commentLines2);
        assertTrue(commentsConfiguration.getAllComments().containsKey(path1));
        assertTrue(commentsConfiguration.getAllComments().containsKey(path2));
    }

}