package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesReturnsEmptyMapIfNoPropertiesTest {

    @Test
    public void getRootEntriesReturnsEmptyMapIfNoPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Map<String, Object> result = builder.getRootEntries();

        assertTrue(result.isEmpty());
    }

}