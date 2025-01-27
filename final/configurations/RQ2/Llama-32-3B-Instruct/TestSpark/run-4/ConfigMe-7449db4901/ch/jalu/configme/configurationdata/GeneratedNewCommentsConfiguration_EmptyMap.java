package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_EmptyMap {

    @Test
    public void newCommentsConfiguration_EmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}