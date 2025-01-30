package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        Property<?> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql");

        Property<?> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("security");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        assertEquals(2, propertyListBuilder.create().size());
    }

}