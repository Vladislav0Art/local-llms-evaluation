package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockedProperty = mock(Property.class);

        // This should not throw any exception
        propertyListBuilder.add(mockedProperty);
    }

}