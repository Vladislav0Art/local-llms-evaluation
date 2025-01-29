package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetAllComments_HasDefaultComments {

    @Test
    public void getAllComments_HasDefaultComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> defaultComments = Collections.singletonMap("path", Arrays.asList());
        assertEquals(defaultComments, commentsConfig.getAllComments());
    }

}