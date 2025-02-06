package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}