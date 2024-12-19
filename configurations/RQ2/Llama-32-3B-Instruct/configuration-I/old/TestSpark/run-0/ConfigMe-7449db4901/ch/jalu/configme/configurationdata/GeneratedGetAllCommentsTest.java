package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        // Arrange, Act & Assert
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        Assertions.assertNotNull(config.getAllComments());
        Assertions.assertEquals(1, config.getAllComments().size());
    }

}