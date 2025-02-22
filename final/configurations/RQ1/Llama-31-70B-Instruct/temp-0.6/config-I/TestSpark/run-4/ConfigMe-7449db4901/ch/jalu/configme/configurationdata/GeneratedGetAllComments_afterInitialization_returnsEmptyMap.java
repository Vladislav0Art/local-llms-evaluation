package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_afterInitialization_returnsEmptyMap {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void getAllComments_afterInitialization_returnsEmptyMap() {
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

}