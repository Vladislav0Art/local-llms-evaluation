package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetComments_EmptyMap_ReturnsEmptyList {

    @Test
    public void getComments_EmptyMap_ReturnsEmptyList() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyList(), config.getComments().values());
    }

}