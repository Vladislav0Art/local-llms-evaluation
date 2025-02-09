package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsCorrectPath {

    @Test
    public void setCommentSetsCorrectPath() {
        var config = new CommentsConfiguration();
        config.setComment("path", "line1");
        assertEquals(Collections.singletonMap("path", Arrays.asList("line1")), config.getAllComments());
    }

}