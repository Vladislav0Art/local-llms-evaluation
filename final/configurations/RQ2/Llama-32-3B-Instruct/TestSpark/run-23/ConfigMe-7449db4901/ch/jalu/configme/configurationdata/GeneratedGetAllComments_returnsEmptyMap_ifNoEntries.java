package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedGetAllComments_returnsEmptyMap_ifNoEntries {

    @Test
    public void getAllComments_returnsEmptyMap_ifNoEntries() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThat(config.getAllComments(), is(Collections.emptyMap()));
    }

}