package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isInitializedWithEmptyMap {

    @Test
    public void newCommentsConfiguration_isInitializedWithEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, ((HashMap) config.getAllComments()).size());
    }

}