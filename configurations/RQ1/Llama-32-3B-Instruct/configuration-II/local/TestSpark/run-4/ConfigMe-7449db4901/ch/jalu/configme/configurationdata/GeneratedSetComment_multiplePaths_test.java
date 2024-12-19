package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_multiplePaths_test {

    @Test
    public void setComment_multiplePaths_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path1 = "path1";
        String[] commentLines1 = {"line1", "line2"};
        config.setComment(path1, commentLines1);
        String path2 = "path2";
        String[] commentLines2 = {"line3", "line4"};
        config.setComment(path2, commentLines2);
        assertEquals(Arrays.asList(commentLines1), config.comments.get(path1));
    }

}