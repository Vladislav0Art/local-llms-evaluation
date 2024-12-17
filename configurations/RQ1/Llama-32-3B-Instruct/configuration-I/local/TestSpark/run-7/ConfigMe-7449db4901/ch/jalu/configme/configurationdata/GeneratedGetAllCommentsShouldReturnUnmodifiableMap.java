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

public class GeneratedGetAllCommentsShouldReturnUnmodifiableMap {

    @Test
    public void getAllCommentsShouldReturnUnmodifiableMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = Collections.unmodifiableMap(comments.comments);
        assertTrue(map instanceof java.util.Map);
        assertTrue(((java.util.Map) map).containsKey("path1"));
        assertEquals(1, ((java.util.Map) map).size());
    }

}