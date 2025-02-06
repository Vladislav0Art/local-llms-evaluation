package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_setComment_withExistingPath {

    @Test
    public void newCommentsConfiguration_setComment_withExistingPath() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<>());
        config.setComment("path", "# comment");
        config.setComment("path", "# newcomment");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.get("path").contains("# newcomment"));
    }

}