package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsWithEmptyPaths {

    @Test
    public void getAllCommentsWithEmptyPaths() {
        Map<String, List<String>> comments = new HashMap<>();
        String path2 = "path2";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.singletonMap("path2", Collections.emptyList()));
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}