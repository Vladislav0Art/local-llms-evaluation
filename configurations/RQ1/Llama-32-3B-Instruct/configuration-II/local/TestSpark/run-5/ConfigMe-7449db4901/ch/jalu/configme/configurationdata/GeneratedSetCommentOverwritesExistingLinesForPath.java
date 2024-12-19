package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentOverwritesExistingLinesForPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentOverwritesExistingLinesForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("newLine"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "\n", "line1");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}