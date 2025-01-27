package ch.jalu.configme.configurationdata;

public class GeneratedSetMultiplePathsResultsInCorrectlyRegisteredEntries {

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