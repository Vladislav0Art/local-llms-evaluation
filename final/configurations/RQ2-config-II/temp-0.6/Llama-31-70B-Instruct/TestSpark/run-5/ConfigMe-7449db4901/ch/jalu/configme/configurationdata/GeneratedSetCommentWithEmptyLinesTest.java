package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCommentWithEmptyLinesTest {

    @Test
    public void setCommentWithEmptyLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path3", "line 5", "");
        assertEquals(Collections.singletonMap("path3", Arrays.asList("line 5")), config.getAllComments());
    }

}