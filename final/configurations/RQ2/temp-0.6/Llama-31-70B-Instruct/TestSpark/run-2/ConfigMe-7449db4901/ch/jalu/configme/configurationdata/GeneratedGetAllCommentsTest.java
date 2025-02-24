package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
    }

}