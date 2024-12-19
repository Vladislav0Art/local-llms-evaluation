package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedNewCommentConfiguration_isInitializedProperly {

    @Test
    public void newCommentConfiguration_isInitializedProperly() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.isEmpty());
    }

}