package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedGetAllCommentsEmptyMapTest {

    @Test
    public void getAllCommentsEmptyMapTest() {
        @NotNull @UnmodifiableView Map<String, @UnmodifiableView List<String>> allComments = new CommentsConfiguration().getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.isEmpty());
    }

}