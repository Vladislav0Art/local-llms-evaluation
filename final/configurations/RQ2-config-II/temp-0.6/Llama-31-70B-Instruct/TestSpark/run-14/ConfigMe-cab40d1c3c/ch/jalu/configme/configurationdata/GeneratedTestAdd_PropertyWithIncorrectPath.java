package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GeneratedTestAdd_PropertyWithIncorrectPath {

    @Test
    public void testAdd_PropertyWithIncorrectPath() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        PropertyListBuilder builder = new PropertyListBuilder();

        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

}