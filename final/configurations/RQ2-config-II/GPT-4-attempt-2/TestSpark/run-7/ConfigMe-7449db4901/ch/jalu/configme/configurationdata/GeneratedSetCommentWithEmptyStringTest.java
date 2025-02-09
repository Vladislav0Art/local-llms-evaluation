package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithEmptyStringTest {

    @Test
    public void setCommentWithEmptyStringTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "");

        List<String> emptyStrComment = configuration.getAllComments().get("path");
        assertEquals(Collections.singletonList(""), emptyStrComment);
    }

}