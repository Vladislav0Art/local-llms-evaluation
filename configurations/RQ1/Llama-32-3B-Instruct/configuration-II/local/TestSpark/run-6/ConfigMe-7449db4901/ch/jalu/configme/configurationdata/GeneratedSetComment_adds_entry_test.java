package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_adds_entry_test {

    @Test
    public void setComment_adds_entry_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String commentLine1 = "comment1";
        String commentLine2 = "comment2";

        config.setComment(path, commentLine1, commentLine2);

        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList(commentLine1, commentLine2), config.comments.get(path));
    }

}