package ch.jalu.configme.configurationdata;

public class GeneratedGetAllComments_emptyComments_returnsEmptyMap {

    @Test
    public void getAllComments_emptyComments_returnsEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.isEmpty());
    }

}