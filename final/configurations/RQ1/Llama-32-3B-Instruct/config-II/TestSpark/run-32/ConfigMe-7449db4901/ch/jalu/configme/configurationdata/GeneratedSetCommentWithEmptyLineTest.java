package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWithEmptyLineTest {

    @Test
    public void setCommentWithEmptyLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLines[] = {"\n"};
        config.setComment(path, commentLines);
        List<String> expected = Collections.emptyList();
        assertEquals(expected, config.comments.get(path));
    }

}