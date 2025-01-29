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

public class GeneratedGetAllComments_MultipleValuesTest {

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
    public void getAllComments_MultipleValuesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        List<String> commentLines1 = Arrays.asList("line1");
        List<String> commentLines2 = Arrays.asList("", "line3");

        config.setComment(path, commentLines1, commentLines2);

        Mockito.when(comments.values()).thenReturn(commentLines1);
        Assertions.assertTrue(config.getAllComments().containsValue(0));
    }

}