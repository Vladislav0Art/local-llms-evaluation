package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_emptyLineResultingInEmptyLineWithoutMarker {

    @Test
    public void setComment_emptyLineResultingInEmptyLineWithoutMarker() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", "", "line2");
        assertTrue(comments.getAllComments().get("path1").isEmpty());
    }

}