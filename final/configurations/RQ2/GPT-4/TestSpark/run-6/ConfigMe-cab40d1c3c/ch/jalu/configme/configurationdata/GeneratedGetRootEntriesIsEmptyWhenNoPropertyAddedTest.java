package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesIsEmptyWhenNoPropertyAddedTest {

    @Test
    public void getRootEntriesIsEmptyWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Map<String, Object> entries = builder.getRootEntries();
        assertNotNull(entries);
        assertTrue(entries.isEmpty());
    }

}