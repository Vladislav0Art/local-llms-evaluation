package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addMultipleNewAndExistingLines {

    @Test
    public void setComment_addMultipleNewAndExistingLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        String path = "path1";
        String commentLines[] = {"", "line1", ""};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList("", "line1", ""), configuration.getAllComments().get(path));
    }

}