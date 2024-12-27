package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.mockito.Mock;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_NoCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void constructor_NoCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}