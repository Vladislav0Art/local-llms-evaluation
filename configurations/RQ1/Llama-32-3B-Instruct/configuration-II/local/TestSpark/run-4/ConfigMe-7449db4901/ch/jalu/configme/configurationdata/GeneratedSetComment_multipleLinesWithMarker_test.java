package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_multipleLinesWithMarker_test {

    @Test
    public void setComment_multipleLinesWithMarker_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        config.setComment(path, commentLines);
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get(path));
    }

}