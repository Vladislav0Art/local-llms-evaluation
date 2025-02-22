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

public class GeneratedSetComment_nullPath_throwsException {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setUp() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void setComment_nullPath_throwsException() {
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment(null, commentLines);
    }

}