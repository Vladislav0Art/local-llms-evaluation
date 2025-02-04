package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class GeneratedConstructor_withComments_test {

    @Test
    public void constructor_withComments_test() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String comment1 = "Comment 1";
        String comment2 = "Comment 2";
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(comment1));
    }

}