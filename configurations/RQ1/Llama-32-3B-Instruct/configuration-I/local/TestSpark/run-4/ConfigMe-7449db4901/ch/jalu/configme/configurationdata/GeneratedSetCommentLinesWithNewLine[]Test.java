package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentLinesWithNewLine[]

Test {

    @Test
    public void setCommentLinesWithNewLine[] Test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "\n");
        assertEquals(Collections.singletonList(""), config.comments.get("test"));
    }

}