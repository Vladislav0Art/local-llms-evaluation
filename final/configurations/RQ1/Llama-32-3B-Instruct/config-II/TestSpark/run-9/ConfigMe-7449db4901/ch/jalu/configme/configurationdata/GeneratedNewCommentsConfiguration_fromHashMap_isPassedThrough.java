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

public class GeneratedNewCommentsConfiguration_fromHashMap_isPassedThrough {

    @Test
    public void newCommentsConfiguration_fromHashMap_isPassedThrough() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration comments = new CommentsConfiguration(commentsMap);
        Map<String, List<String>> commentsMapPassed = comments.comments;
        assertThat(commentsMap.equals(commentsMapPassed), is(true));
    }

}