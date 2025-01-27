package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentsConfigurationHasNoComments {

    @Test
    public void newCommentsConfigurationHasNoComments() {
        // given
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        // when
        Map<String, List<String>> allComments = commentsConfig.getAllComments();

        // then
        assertThat(allComments.isEmpty(), is(true));
    }

}