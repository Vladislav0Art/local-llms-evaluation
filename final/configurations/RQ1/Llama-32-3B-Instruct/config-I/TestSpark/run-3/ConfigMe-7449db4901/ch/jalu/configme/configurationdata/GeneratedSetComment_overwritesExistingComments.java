package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_overwritesExistingComments {

    @Test
    public void setComment_overwritesExistingComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> commentLines1 = Arrays.asList("line1");
        String path = "/path";
        config.setComment(path, "line2", "line3");
        assertEquals(Arrays.asList("line2", "line3"), config.comments.get(path));
    }

}