package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_isEmpty {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

}