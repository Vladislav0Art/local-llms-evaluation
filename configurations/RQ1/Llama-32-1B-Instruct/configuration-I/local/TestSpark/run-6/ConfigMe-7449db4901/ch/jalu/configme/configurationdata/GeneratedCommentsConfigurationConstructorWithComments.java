package ch.jalu.configme.configurationdata;

public class GeneratedCommentsConfigurationConstructorWithComments {

    @Test
    public void CommentsConfigurationConstructorWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        comments.put("path2", Collections.singletonList("line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(2, commentsConfiguration.comments.size());
    }

}