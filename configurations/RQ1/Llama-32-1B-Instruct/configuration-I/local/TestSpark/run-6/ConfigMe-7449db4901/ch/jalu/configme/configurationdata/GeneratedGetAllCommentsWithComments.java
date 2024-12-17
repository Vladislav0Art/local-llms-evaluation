package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsWithComments {

    @Test
    public void getAllCommentsWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        String path1 = "path1";
        String...commentLines1 = {"line1", "\nline2"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.singletonMap("path1", Collections.singletonList(commentLines1)));
        assertEquals(1, commentsConfiguration.getAllComments().size());
    }

}