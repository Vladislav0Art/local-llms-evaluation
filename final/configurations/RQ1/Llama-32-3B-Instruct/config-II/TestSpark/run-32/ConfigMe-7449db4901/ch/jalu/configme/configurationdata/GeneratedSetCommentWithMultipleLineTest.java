package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWithMultipleLineTest {

    @Test
    public void setCommentWithMultipleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"line1\n", "line2"};
        config.setComment(path, commentLines);
        List<String> expected = Arrays.asList("line1", "line2");
        assertEquals(expected, config.comments.get(path));
    }

}