package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty1 = mock(Property.class);
        Property<String> mockProperty2 = mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("test.path");
        when(mockProperty2.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty1);
        listBuilder.add(mockProperty2);
    }

}