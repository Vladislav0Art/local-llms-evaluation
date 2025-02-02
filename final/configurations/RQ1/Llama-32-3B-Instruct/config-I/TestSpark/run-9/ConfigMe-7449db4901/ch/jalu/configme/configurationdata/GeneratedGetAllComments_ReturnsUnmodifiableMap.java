package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_ReturnsUnmodifiableMap {

    @Test
    public void getAllComments_ReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        commentsConfiguration.setComment(path1, line1);
        Map<String, List<String>> commentLines = commentsConfiguration.getAllComments();
        assertTrue(commentLines instanceof Map);
    }

}