package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedGetAllCommentsTest_ReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsTest_ReturnsUnmodifiableMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = config.getAllComments();
        assertTrue(map instanceof org.jetbrains.annotations.UnmodifiableView);
    }

}