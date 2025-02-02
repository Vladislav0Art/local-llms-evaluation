package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentConfiguration_ReturnsEmptyMap {

    @Test
    public void newCommentConfiguration_ReturnsEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getComments());
    }

}