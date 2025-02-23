package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedAddProperty_validProperty_addsProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_validProperty_addsProperty() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.path");

        propertyListBuilder.add(property);

        assertEquals(1, propertyListBuilder.getRootEntries().size());
        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
        assertTrue(propertyListBuilder.getRootEntries().get("test") instanceof Map);
        assertTrue(((Map<?, ?>) propertyListBuilder.getRootEntries().get("test")).containsKey("path"));
        assertEquals(property, ((Map<?, ?>) propertyListBuilder.getRootEntries().get("test")).get("path"));
    }

}