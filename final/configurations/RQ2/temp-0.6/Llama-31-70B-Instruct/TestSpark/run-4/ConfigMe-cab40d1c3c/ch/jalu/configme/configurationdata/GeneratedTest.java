package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Assertions.assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        Assertions.assertEquals(1, propertyListBuilder.getRootEntries().size());
        Assertions.assertEquals(property, propertyListBuilder.getRootEntries().values().iterator().next());
    }

    @Test
    public void createWithNoPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> properties = propertyListBuilder.create();
        Assertions.assertTrue(properties.isEmpty());
    }

}