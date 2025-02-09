package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("line1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals(commentsConfiguration.getAllComments(), comments);
    }

}