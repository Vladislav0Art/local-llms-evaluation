package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedSetMultipleComments Test {

    @Test
    public void SetMultipleComments

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path1 = "testPath1";
        String[] commentLines1 = {"comment1", "\n"};
        String path2 = "testPath2";
        String[] commentLines2 = {"comment2", "comment3\n"};
        configuration.setComment(path1, commentLines1);
        configuration.setComment(path2, commentLines2);
        assertTrue(configuration.comments.containsKey(path1));
        assertTrue(configuration.comments.containsKey(path2));
    }

}