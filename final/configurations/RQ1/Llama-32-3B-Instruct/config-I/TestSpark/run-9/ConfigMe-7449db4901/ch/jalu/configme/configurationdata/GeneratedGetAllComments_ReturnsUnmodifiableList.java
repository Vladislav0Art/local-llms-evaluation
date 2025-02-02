package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_ReturnsUnmodifiableList {

    @Test
    public void getAllComments_ReturnsUnmodifiableList() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path1 = "path1";
        String line1 = "line1";
        commentsConfiguration.setComment(path1, line1);
        List<String> commentLines = commentsConfiguration.getAllComments().get(path1);
        assertTrue(commentLines instanceof List);
    }

}