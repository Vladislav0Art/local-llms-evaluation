package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedGetRootEntriesMapIsNotEmptyWhenPropertyAddedTest {

    @Test
    public void getRootEntriesMapIsNotEmptyWhenPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = builder.getRootEntries();
        assertFalse(entries.isEmpty());
    }

}