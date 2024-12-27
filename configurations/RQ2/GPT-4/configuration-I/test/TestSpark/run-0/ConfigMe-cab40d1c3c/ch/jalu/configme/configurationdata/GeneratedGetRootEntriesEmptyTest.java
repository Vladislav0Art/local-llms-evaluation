package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.isEmpty());
    }

}