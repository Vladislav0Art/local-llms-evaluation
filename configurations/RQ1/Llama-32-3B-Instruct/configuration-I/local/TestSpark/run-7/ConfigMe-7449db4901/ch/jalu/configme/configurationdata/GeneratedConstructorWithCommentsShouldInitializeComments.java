package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Method;

public class GeneratedConstructorWithCommentsShouldInitializeComments {

    @Test
    public void constructorWithCommentsShouldInitializeComments() throws Exception {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfig.comments);
    }

}