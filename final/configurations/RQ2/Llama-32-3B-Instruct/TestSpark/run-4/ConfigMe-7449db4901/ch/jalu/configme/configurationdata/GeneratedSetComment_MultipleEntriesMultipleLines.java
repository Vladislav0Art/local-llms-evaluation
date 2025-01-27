package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_MultipleEntriesMultipleLines {

    @Test
    public void setComment_MultipleEntriesMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path1 = "path1";
        String[] commentLine1 = {"comment1"};
        String path2 = "path2";
        String[] commentLine2 = {"comment2"};
        configuration.setComment(path1, commentLine1[0]);
        configuration.setComment(path2, commentLine2[0]);
        assertEquals(2, configuration.getAllComments().size());
    }

}