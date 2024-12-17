package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentShouldAddNewLineWithNoMarker {

    @Test
    public void setCommentShouldAddNewLineWithNoMarker() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};

        Mockito.when(configuration.getComments()).thenReturn(comments);

        configuration.setComment("path", "", commentLines[0]);
        assertThat(configuration.getComments().get("path"), is(List.of()));
    }

}