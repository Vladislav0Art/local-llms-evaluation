package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedSetComment_NullString_commentLines_test {

    @Test
    public void setComment_NullString_commentLines_test() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertThrows(NullPointerException.class, () -> config.setComment("path1", null));
    }

}