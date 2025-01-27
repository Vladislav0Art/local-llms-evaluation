package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_MultipleEntriesMultipleEmptyLines {

    @Test
    public void setComment_MultipleEntriesMultipleEmptyLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path1 = "path1";
        String[] commentLine1 = {"comment1"};
        String path2 = "path2";
        String[] commentLine2 = {""};
        configuration.setComment(path1, Arrays.asList(commentLine1));
        configuration.setComment(path2, Arrays.asList(commentLine2));
        assertEquals(2, configuration.getAllComments().size());
    }

}