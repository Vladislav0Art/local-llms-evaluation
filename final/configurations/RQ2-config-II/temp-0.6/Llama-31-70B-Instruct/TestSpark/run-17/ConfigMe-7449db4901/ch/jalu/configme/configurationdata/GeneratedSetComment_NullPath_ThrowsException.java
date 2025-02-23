package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetComment_NullPath_ThrowsException {

    @Test
    public void setComment_NullPath_ThrowsException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = null;
        String[] commentLines = new String[]{"line1", "line2"
        }

    }