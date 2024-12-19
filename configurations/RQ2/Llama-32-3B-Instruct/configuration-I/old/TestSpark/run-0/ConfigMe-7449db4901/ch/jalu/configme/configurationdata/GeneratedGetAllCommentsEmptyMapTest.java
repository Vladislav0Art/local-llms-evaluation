package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsEmptyMapTest {

    @Test
    public void getAllCommentsEmptyMapTest() {
        // Arrange, Act & Assert
        CommentsConfiguration config = new CommentsConfiguration();
        Assertions.assertNotNull(config.getAllComments());
        Assertions.assertEquals(0, config.getAllComments().size());
    }

}