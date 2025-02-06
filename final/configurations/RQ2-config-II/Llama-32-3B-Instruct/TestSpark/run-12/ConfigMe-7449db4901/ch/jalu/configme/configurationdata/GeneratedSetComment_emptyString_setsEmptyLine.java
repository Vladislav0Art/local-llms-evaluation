package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedSetComment_emptyString_setsEmptyLine {

    @Test
    public void setComment_emptyString_setsEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "test";
        String commentLines[] = {"", "", ""};
        configuration.setComment(path, commentLines);
        assertTrue(configuration.getAllComments().get(path).isEmpty());
    }

}