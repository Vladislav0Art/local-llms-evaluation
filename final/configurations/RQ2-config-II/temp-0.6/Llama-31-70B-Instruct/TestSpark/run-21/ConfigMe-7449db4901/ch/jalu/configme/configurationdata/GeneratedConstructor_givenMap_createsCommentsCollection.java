package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_givenMap_createsCommentsCollection {

    @Test
    public void constructor_givenMap_createsCommentsCollection() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment 1", "comment 2"));
        comments.put("key2", Arrays.asList("comment 3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertThat(commentsConfiguration.getAllComments()).containsAllEntriesOf(comments);
    }

}