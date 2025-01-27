package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_SingleEntryMultipleLines {

    @Test
    public void setComment_SingleEntryMultipleLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path";
        String[] commentLines = {"comment", "anotherComment"};
        configuration.setComment(path, commentLines[0], commentLines[1]);
        assertEquals(2, configuration.getAllComments().size());
    }

}