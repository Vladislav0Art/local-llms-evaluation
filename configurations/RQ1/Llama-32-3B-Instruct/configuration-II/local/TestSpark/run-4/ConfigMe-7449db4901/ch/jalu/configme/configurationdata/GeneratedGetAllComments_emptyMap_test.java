package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_emptyMap_test {

    @Test
    public void getAllComments_emptyMap_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        config.comments = emptyMap;
        assertTrue(config.getAllComments().isEmpty());
    }

}