package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsNoComments {

    @Test
    public void getAllCommentsNoComments() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}