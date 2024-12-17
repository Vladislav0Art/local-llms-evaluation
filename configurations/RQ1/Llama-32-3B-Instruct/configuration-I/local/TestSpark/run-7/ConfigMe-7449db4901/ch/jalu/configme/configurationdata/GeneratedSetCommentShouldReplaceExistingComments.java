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

public class GeneratedSetCommentShouldReplaceExistingComments {

    @Test
    public void setCommentShouldReplaceExistingComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String comment = "new line";
        comments.setComment("path1", comment);
        String otherComment = "other line";
        comments.setComment("path1", otherComment);
        assertEquals(Arrays.asList(otherComment), comments.comments.get("path1"));
    }

}