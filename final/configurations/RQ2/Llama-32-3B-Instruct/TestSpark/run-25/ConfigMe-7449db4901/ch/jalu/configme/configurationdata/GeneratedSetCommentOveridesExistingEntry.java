package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentOveridesExistingEntry {

    private java.util.Map<String, List<String>> allComments;

    public CommentsConfiguration() {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
    }

    public java.util.Map<String, List<String>> getAllComments() {
        return this.allComments;
    }

    public void setComment(String path, String[] commentLines) {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
        this.allComments.put(path, Arrays.asList(commentLines));
    }
}

public class CommentsConfigurationTest {

    @Test
    public void setCommentOveridesExistingEntry() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path/to/line";
        String[] commentLines = {"existing", "new"};
        commentsConfiguration.setComment(path, commentLines);
        assertTrue(commentsConfiguration.getAllComments().containsKey(path));
    }

}