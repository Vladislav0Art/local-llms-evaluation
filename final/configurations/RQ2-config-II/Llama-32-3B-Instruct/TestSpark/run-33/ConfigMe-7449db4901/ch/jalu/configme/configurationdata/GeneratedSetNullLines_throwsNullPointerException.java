package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetNullLines_throwsNullPointerException {

    @Test
    public void setNullLines_throwsNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment("path", null, null));
    }

}