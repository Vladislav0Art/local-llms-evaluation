package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("property.path");
        Property property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("property.path");

        listBuilder.add(property1);
        listBuilder.add(property2);
    }

}