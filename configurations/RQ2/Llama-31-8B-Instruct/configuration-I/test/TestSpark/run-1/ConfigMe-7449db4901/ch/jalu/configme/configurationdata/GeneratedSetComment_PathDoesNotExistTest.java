package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.mockito.InjectMocks;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_PathDoesNotExistTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_PathDoesNotExistTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "line1", "line2");
        assertEquals(Collections.singletonMap("path1", Arrays.asList("line1", "line2")), commentsConfiguration.getAllComments());
    }

}