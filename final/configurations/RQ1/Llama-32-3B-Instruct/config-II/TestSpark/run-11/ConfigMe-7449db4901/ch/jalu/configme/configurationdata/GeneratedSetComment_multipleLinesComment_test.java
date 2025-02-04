package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedSetComment_multipleLinesComment_test {

    @Test
    public void setComment_multipleLinesComment_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";
        config.setComment("path", comment1, comment2);
        assertTrue(config.comments.containsKey("path"));
        assertEquals(2, ((List<String>) config.comments.get("path")).size());
    }

}