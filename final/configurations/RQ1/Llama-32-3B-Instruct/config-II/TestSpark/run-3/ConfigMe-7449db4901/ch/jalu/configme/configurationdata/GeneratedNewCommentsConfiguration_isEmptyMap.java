package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isEmptyMap {

    @Test
    public void newCommentsConfiguration_isEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.comments.size());
    }

}