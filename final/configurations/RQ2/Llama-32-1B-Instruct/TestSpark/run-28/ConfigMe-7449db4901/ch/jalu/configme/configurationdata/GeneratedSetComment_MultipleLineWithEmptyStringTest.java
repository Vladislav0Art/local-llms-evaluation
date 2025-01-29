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

public class GeneratedSetComment_MultipleLineWithEmptyStringTest {

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
    public void setComment_MultipleLineWithEmptyStringTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "", "line3"};

        config.setComment(path, commentLines);

        Mockito.verify(comments).set(Path.class, Arrays.asList(commentLines));
        Assertions.assertEquals(Arrays.asList(commentLines), comments.getOrDefault(path, Collections.emptyList()));
    }

}