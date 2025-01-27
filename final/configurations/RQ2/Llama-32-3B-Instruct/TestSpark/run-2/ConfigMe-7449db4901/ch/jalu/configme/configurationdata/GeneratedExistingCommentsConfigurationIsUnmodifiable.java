package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedExistingCommentsConfigurationIsUnmodifiable {

    @Test
    public void existingCommentsConfigurationIsUnmodifiable() {
        // given
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);

        // when
        Map<String, List<String>> allComments = commentsConfig.getAllComments();

        // then
        assertThat(commentsConfig.isUnmodifiable(), is(true));
    }

}