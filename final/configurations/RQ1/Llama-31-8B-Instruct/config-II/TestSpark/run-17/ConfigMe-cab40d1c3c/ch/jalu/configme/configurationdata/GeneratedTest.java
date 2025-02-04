package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_NoExistingPath_AddsProperty() {
        Property<String> property = new Property<>("test", "value");
        builder.add(property);
        assertEquals(1, builder.getRootEntries().size());
    }

    @Test
    public void addProperty_ExistingPath_ThrowsException() {
        Property<String> property = new Property<>("test", "value");
        builder.add(property);
        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

    @Test
    public void addProperty_MultipleProperties_AddsProperties() {
        Property<String> property1 = new Property<>("test1", "value1");
        Property<String> property2 = new Property<>("test2", "value2");
        builder.add(property1);
        builder.add(property2);
        assertEquals(2, builder.getRootEntries().size());
    }

    @Test
    public void create_EmptyBuilder_ReturnsEmptyList() {
        List<Property<?>> result = builder.create();
        assertEquals(0, result.size());
    }

    @Test
    public void create_AddedProperties_ReturnsProperties() {
        Property<String> property1 = new Property<>("test1", "value1");
        Property<String> property2 = new Property<>("test2", "value2");
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
        assertEquals(property1, result.get(0));
        assertEquals(property2, result.get(1));
    }

}