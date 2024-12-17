package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentsConfigurationConstructor {

    @Test
    public void testCommentsConfigurationConstructor() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, commentsConfig.getAllComments().size());
    }

}