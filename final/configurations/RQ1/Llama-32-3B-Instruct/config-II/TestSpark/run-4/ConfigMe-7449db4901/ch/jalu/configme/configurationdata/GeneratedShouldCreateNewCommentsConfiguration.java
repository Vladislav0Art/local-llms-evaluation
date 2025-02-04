package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedShouldCreateNewCommentsConfiguration {

    @Test
    public void shouldCreateNewCommentsConfiguration() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThat(commentsConfig.comments, is(new HashMap<>()));
    }

}