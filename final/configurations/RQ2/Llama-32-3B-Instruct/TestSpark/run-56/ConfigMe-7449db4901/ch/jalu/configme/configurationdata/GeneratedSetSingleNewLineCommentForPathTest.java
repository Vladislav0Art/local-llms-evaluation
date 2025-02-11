package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetSingleNewLineCommentForPathTest {

    @Test
    public void setSingleNewLineCommentForPathTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        String path = "path2";
        String[] commentLines = {"\n"};
        commentsConfig.setComment(path, commentLines);
        assertEquals(Collections.singletonList("\n"), comments.get(path));
    }

}