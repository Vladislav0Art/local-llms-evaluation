package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetMultipleCommentsTest {

    @Test
    public void setMultipleCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        java.util.Arrays.setAll(java.util.Arrays.asList("commentLine1", "commentLine2"), i -> commentsConfiguration.setComment("path1", "commentLine" + i));
        assertTrue(commentsConfiguration.getComment("path1").contains("commentLine0"));
    }

}