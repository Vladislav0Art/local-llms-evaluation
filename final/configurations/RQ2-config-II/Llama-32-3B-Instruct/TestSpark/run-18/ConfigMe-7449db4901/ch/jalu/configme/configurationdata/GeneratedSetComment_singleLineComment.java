package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_singleLineComment {

    @Test
    public void setComment_singleLineComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("");
        configuration.setComment("path", commentLines.toArray(new String[0]));
        assertTrue(configuration.getAllComments().get("path").isEmpty());
    }

}