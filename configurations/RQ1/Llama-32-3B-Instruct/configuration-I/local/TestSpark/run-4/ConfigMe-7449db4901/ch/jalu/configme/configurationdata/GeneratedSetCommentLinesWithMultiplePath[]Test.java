package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentLinesWithMultiplePath[]

Test {

    @Test
    public void setCommentLinesWithMultiplePath[] Test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test1", "line11", "line12");
        config.setComment("test2", "line21", "line22");
        assertEquals(Arrays.asList("line11", "line12"), config.comments.get("test1"));
        assertEquals(Arrays.asList("line21", "line22"), config.comments.get("test2"));
    }

}