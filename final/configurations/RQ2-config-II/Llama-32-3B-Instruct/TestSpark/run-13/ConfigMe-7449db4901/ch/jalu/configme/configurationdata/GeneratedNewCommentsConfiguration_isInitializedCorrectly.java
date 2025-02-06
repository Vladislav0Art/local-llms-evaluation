package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isInitializedCorrectly {

    @Test
    public void newCommentsConfiguration_isInitializedCorrectly() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
    }

}