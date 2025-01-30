package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedGetAllCommentsWhenIsEmptyTest {

    @Test
    public void getAllCommentsWhenIsEmptyTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertThat(allComments.size(), is(0));
    }

}