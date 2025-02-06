package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_singleLine_setsCorrectly {

    @Test
    public void setComment_singleLine_setsCorrectly() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"#line1"};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList("#line1"), configuration.getAllComments().get(path));
    }

}