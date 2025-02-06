package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

}