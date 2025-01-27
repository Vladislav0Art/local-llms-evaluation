package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration(new HashMap<>());

        // Test that the list of comments for a path contains only empty lines
        List<String> commentList = commentsConfig.getAllComments();
        assertEquals(0, commentList.size());
    }

}