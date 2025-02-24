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
public class GeneratedConstructor_emptyMap_createsEmptyCommentsCollection {

    @Test
    public void constructor_emptyMap_createsEmptyCommentsCollection() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertThat(commentsConfiguration.getAllComments()).isEmpty();
    }

}