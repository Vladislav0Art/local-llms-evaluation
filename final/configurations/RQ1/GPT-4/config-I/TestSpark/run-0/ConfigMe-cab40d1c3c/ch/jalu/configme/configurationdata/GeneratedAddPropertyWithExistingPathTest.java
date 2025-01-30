package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        Property<String> propertyMock = mock(Property.class);
        when(propertyMock.getPath()).thenReturn("existing.path");
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock);
        listBuilder.add(propertyMock);
    }

}