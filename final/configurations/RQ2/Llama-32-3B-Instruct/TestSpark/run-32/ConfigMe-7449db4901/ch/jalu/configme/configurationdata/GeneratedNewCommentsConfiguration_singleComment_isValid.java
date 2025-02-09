package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_singleComment_isValid {

    @Test
    public void newCommentsConfiguration_singleComment_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}