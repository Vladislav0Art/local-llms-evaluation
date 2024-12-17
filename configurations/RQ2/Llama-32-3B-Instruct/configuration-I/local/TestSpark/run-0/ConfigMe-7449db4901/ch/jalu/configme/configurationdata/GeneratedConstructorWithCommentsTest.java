package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        // Arrange, Act & Assert
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        Assertions.assertNotNull(config);
        Assertions.assertEquals(1, config.getComment("path").size());
    }

}