package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addMultipleNewLines {

    @Test
    public void setComment_addMultipleNewLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path1";
        String commentLines[] = {"", "", ""};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList("", "", ""), configuration.getAllComments().get(path));
    }

}