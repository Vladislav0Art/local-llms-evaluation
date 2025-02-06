package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_withMap_isInitialized {

    @Test
    public void newCommentsConfiguration_withMap_isInitialized() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertNotNull(commentsConfiguration.getAllComments());
    }

}