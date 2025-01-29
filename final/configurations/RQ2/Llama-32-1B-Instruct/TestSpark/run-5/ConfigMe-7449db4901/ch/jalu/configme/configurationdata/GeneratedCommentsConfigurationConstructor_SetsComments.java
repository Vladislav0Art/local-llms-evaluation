package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedCommentsConfigurationConstructor_SetsComments {

    @Test
    public void CommentsConfigurationConstructor_SetsComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfig.getAllComments());
    }

}