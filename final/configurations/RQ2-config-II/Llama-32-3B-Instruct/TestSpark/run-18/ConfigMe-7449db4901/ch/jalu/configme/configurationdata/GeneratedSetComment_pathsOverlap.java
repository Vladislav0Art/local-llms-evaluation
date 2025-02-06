package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_pathsOverlap {

    @Test
    public void setComment_pathsOverlap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("line1");
        configuration.setComment("path1", commentLines.toArray(new String[0]));
        assertEquals(Collections.singletonMap("path1", Collections.singletonList("line1")), configuration.getAllComments());
    }

}