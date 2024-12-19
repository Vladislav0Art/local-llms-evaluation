package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_singleLineWithoutMarker_test {

    @Test
    public void setComment_singleLineWithoutMarker_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String commentLine = "\n";
        String[] commentLines = {commentLine};
        config.setComment(path, commentLines);
        assertEquals(Collections.singletonList(commentLine), config.comments.get(path));
    }

}