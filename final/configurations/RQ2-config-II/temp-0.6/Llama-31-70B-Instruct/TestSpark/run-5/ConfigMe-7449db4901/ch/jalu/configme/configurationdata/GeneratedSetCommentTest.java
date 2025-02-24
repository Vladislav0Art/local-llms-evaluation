package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path2", "line 3", "line 4");
        assertEquals(Collections.singletonMap("path2", Arrays.asList("line 3", "line 4")), config.getAllComments());
    }

}