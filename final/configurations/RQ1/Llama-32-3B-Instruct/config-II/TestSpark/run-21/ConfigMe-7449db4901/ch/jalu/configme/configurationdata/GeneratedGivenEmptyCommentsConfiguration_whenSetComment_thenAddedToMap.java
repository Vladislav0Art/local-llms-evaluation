package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenEmptyCommentsConfiguration_whenSetComment_thenAddedToMap {

    @Test
    public void givenEmptyCommentsConfiguration_whenSetComment_thenAddedToMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment");
        assertEquals(1, configuration.comments.size());
    }

}