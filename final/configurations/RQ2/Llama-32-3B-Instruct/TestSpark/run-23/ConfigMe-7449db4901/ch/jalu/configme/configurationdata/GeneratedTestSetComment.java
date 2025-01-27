package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        // Create a map of comments for the configuration
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));

        try {
            // Attempt to set a comment with an empty list
            CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
            commentsConfig.setComment("path2", Collections.emptyList());

            // Fail the test if no exception was thrown
            fail();
        } catch (NullPointerException e) {
            // Pass if an exception is thrown as expected
        }

        try {
            // Attempt to set a comment with two elements and empty list
            CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
            commentsConfig.setComment("path2", Arrays.asList("", ""));

            // Fail the test if no exception was thrown
            fail();
        } catch (NullPointerException e) {
            // Pass if an exception is thrown as expected
        }
    }

}