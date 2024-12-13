package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorTest_EmptyComments {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void constructorTest_EmptyComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.comments);
        assertTrue(commentsConfiguration.comments.isEmpty());
    }

}