package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetComment_SingleEntryMultipleLinesWithEmptyLine {

    @Test
    public void setComment_SingleEntryMultipleLinesWithEmptyLine() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path";
        String[] commentLines = {"comment", "", "anotherComment"};
        configuration.setComment(path, commentLines[0], commentLines[2]);
        assertEquals(1, configuration.getAllComments().size());
    }

}