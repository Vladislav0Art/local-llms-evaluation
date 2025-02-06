package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_EmptyMap Test {

    @Test
    public void getAllComments_EmptyMap

    Test() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}