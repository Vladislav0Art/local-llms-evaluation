package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationIsNotNull {

    @Test
    public void newCommentsConfigurationIsNotNull() {
        var config = new CommentsConfiguration();
        assertNotNull(config.comments);
    }

}