package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetAllComments_MultipleElementList {

    @Test
    public void setAllComments_MultipleElementList() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> comments = Arrays.asList("multiple_element1", "multiple_element2");

        // when
        config.setAllComments(comments);

        // then
        assertEquals(comments, config.getAllComments());
    }

}