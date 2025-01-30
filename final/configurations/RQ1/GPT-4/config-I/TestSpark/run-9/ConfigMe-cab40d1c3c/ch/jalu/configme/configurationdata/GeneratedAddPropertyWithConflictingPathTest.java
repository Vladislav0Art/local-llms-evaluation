package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyWithConflictingPathTest {

    @Test
    public void addPropertyWithConflictingPathTest() {
        Property<?> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql");

        Property<?> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("DataSource");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
    }

}