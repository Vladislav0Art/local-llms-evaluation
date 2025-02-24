package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedGetRootEntriesTest {

    private PropertyListBuilder propertyListBuilder;
    private Property<?> property;

    @Test
    public void getRootEntriesTest() {
        propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        when(propertyListBuilder.getRootEntries()).thenReturn(rootEntries);
        assertTrue(propertyListBuilder.getRootEntries().isEmpty());
    }

}