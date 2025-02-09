package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetEmptyCommentsTest {

    @Test
    public void setEmptyCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "");
        assertTrue(commentsConfiguration.getComment("path1").isEmpty());
    }

}