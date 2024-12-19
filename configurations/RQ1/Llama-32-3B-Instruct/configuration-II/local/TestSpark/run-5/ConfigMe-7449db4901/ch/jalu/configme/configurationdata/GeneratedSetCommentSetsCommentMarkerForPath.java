package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSetsCommentMarkerForPath {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentSetsCommentMarkerForPath() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration();
        newConfig.setComment("path", "line1", "");
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}