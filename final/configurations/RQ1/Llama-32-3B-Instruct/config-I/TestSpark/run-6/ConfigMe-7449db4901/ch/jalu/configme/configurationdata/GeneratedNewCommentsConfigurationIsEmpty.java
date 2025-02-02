package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsEmpty {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, commentsConfig.comments.size());
    }

}