package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_addsNewEntry {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void setComment_addsNewEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String[] commentLines = {"", "newComment"};
        configuration.setComment("path1", commentLines);
        assertEquals(asList(commentLines), configuration.getAllComments().get("path1"));
    }

}