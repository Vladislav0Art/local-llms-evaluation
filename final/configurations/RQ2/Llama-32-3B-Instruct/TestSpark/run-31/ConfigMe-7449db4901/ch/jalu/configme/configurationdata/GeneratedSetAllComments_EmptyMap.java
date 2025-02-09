package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetAllComments_EmptyMap {

    @Test
    public void setAllComments_EmptyMap() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        List<String> comments = Collections.emptyList();

        // when
        config.setAllComments(comments);

        // then
        assertEquals(comments, config.getAllComments());
    }

}