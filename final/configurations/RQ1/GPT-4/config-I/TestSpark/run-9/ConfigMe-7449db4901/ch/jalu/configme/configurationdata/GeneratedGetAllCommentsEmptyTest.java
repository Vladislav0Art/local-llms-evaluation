package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        // given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // when
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // then
        assertEquals(0, allComments.size());
    }

}