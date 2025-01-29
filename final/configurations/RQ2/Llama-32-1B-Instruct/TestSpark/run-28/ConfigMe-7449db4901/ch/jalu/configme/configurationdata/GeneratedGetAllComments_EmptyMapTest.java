package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.Comment;
import ch.jalu.configme.configurationdata.LineComment;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_EmptyMapTest {

    @Mock
    private Map<String, List<String>> comments;

    @BeforeEach
    void setup() {
        Mockito.reset(comments);
    }

    @AfterEach
    void tearDown() {
        Mockito.reset(comments);
    }

    @Test
    public void getAllComments_EmptyMapTest() {
        CommentsConfiguration config = new CommentsConfiguration();

        Mockito.when(comments.values().stream()).thenReturn(Collections.emptyList());

        Assertions.assertFalse(config.getAllComments().containsValue(0));
    }

}