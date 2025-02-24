package ch.jalu.configme.configurationdata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void constructor_emptyComments_returnsNonNull() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertThat(commentsConfiguration, notNullValue());
    }

    @Test
    public void constructor_nonEmptyComments_returnsNonNull() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("pathA", Collections.singletonList("commentA"));
        comments.put("pathB", Collections.singletonList("commentB"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertThat(commentsConfiguration, notNullValue());
    }

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, "commentA"));
    }

}