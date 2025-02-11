package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

}