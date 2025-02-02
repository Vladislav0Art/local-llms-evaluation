package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_addsMultipleComments {

    @Test
    public void setComment_addsMultipleComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> commentLines1 = Arrays.asList("line1", "line2");
        List<String> commentLines2 = Arrays.asList("line3", "line4");
        String path = "/path";
        String[] lines = {"line1", "line2", "line3", "line4"};
        config.setComment(path, lines);
        assertEquals(Arrays.asList(lines), config.comments.get(path));
    }

}