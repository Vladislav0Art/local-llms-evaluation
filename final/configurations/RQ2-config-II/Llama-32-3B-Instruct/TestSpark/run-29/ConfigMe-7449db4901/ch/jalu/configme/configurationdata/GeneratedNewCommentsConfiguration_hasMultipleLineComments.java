package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_hasMultipleLineComments {

    @Test
    public void newCommentsConfiguration_hasMultipleLineComments() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<>());
        config.setComment("path", "# comment1\n# comment2");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.get("path").contains("# comment1"));
        assertTrue(comments.get("path").contains("# comment2"));
    }

}