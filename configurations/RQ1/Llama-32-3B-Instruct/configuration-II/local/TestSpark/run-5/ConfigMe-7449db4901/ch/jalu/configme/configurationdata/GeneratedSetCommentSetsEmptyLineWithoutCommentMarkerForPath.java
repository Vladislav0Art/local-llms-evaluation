package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSetsEmptyLineWithoutCommentMarkerForPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentSetsEmptyLineWithoutCommentMarkerForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList(""));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "", "");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}