package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_validPathAndCommentLines_setsCorrectComments {

    @Test
    public void setComment_validPathAndCommentLines_setsCorrectComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "some.path";
        String[] commentLines = new String[]{"comment1", "comment2"};
        config.setComment(path, commentLines);
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

}