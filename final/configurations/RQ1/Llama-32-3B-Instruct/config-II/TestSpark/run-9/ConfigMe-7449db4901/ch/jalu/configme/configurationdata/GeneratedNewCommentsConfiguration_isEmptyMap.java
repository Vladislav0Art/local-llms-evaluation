package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_isEmptyMap {

    @Test
    public void newCommentsConfiguration_isEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = comments.comments;
        assertThat(commentsMap.isEmpty(), is(true));
    }

}