package ch.jalu.configme.configurationdata;

public class GeneratedTestRemoveComment {

    @Test
    public void testRemoveComment() {
        CommentConfig commentConfig = new CommentConfig();
        List<String> expected = Arrays.asList("line1", "line2");
        commentConfig.addComment("line1");
        commentConfig.removeComment("line1");
        commentConfig.addComment("line2");
        assertEquals(expected, commentConfig.getAllComments());
    }

}