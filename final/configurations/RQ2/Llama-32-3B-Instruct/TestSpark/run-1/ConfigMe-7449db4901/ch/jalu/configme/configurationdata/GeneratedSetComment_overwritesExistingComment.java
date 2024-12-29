package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_overwritesExistingComment {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void setComment_overwritesExistingComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", asList("", "comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String[] commentLines = {"", "", "newComment"};
        configuration.setComment("path1", commentLines);
        assertEquals(asList(commentLines), configuration.getAllComments().get("path1"));
    }

}