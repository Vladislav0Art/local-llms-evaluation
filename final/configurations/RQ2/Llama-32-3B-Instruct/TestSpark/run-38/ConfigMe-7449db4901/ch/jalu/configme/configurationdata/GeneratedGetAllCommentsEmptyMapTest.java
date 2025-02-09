package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsEmptyMapTest {

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> comments = Collections.emptyMap();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNull(commentsConfiguration.getAllComments());
    }

}