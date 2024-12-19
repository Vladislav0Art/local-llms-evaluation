package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSetsLinesForPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentSetsLinesForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "line1", "line2");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}