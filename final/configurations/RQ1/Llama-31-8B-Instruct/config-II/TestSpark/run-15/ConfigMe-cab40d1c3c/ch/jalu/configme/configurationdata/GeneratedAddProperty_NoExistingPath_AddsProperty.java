package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.exception.ConfigMeException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_NoExistingPath_AddsProperty {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_NoExistingPath_AddsProperty() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.path");
        builder.add(property);
        verify(builder).add(property);
    }

}