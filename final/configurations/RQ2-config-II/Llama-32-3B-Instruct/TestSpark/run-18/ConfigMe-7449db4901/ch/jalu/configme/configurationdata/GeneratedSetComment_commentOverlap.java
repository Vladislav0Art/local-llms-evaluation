package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_commentOverlap {

    @Test
    public void setComment_commentOverlap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("line1", "", "line3");
        configuration.setComment("path", commentLines.toArray(new String[0]));
        assertEquals(Arrays.asList("line1", "line3"), configuration.getAllComments().get("path"));
    }

}