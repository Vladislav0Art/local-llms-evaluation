package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsTest() {
        commentsConfiguration.setComment("path1", "line1");
        commentsConfiguration.setComment("path2", "line2");
        assertEquals(2, commentsConfiguration.getAllComments().size());
    }

}