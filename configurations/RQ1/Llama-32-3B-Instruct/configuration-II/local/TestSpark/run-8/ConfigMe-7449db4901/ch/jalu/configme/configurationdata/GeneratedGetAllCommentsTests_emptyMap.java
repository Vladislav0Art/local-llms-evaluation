package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTests_emptyMap {

    @Test
    public void getAllCommentsTests_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

}