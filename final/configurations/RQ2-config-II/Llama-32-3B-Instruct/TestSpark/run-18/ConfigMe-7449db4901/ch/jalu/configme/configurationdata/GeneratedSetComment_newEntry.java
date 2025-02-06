package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_newEntry {

    @Test
    public void setComment_newEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("");
        configuration.setComment("newPath", commentLines.toArray(new String[0]));
        assertEquals(Collections.singletonMap("newPath", Collections.singletonList("")), configuration.getAllComments());
    }

}