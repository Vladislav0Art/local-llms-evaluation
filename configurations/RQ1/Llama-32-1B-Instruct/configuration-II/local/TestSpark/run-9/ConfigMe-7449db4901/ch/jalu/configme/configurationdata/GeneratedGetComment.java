package ch.jalu.configme.configurationdata;

public class GeneratedGetComment {

    @Test
    public void getComment() {
        String path = "path";
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments().get(path);
        assertNotNull(comments);
    }

}