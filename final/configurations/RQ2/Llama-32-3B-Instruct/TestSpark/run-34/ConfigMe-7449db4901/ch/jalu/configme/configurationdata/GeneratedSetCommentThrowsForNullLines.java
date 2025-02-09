package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentThrowsForNullLines {

    @Test
    public void setCommentThrowsForNullLines() {
        var config = new CommentsConfiguration(Collections.singletonMap("path", Arrays.asList("line1")));
        config.setComment("path", null);
    }

}