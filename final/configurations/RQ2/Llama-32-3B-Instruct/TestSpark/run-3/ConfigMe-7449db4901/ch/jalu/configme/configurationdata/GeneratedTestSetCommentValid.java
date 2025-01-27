package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentValid {

    @Test
    public void testSetCommentValid() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentLinesMap);
        commentsConfiguration.setComment("path1", "line3");
    }

}