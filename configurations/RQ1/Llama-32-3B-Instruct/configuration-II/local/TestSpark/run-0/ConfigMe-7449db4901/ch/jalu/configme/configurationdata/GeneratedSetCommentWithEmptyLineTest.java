package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWithEmptyLineTest {

    @Test
    public void setCommentWithEmptyLineTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "", "line2");
        assertTrue(configuration.comments.containsKey("path"));
        List<String> expected = Arrays.asList("", "line2");
        assertEquals(expected, configuration.comments.get("path"));
    }

}