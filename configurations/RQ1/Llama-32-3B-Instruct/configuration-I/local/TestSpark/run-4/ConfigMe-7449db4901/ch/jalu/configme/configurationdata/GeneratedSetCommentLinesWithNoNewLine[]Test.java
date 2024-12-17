package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentLinesWithNoNewLine[]

Test {

    @Test
    public void setCommentLinesWithNoNewLine[] Test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get("test"));
    }

}