package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetEmptyPath_ReturnsEmptyList {

    @Test
    public void getEmptyPath_ReturnsEmptyList() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyList(), config.getAllComments().get(""));
    }

}