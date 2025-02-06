package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationHasEmptyMap {

    @Test
    public void newCommentsConfigurationHasEmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}