package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_overrides_existing_entry_test {

    @Test
    public void setComment_overrides_existing_entry_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String commentLine1 = "comment1";

        config.setComment(path, commentLine1);

        config.setComment(path, "newComment");

        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList("newComment"), config.comments.get(path));
    }

}