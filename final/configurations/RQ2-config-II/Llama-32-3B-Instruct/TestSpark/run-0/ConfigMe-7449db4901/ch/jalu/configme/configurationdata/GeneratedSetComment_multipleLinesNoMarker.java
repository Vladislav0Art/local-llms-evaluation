package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_multipleLinesNoMarker {

    @Test
    public void setComment_multipleLinesNoMarker() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", "line1\nline2\nline3");
        assertEquals(Arrays.asList("line1", "line2"), comments.getAllComments().get("path1"));
    }

}