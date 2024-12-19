package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationIsEmpty() {
        Assertions.assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

    @Test
    public void newCommentsConfigurationIsNotUnmodifiable() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration(expected);
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

    @Test
    public void setCommentSetsLinesForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "line1", "line2");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

    @Test
    public void setCommentOverwritesExistingLinesForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("newLine"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "\n", "line1");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

    @Test
    public void setCommentSetsCommentMarkerForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "line1", "");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

    @Test
    public void setCommentSetsEmptyLineWithoutCommentMarkerForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList(""));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "", "");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}