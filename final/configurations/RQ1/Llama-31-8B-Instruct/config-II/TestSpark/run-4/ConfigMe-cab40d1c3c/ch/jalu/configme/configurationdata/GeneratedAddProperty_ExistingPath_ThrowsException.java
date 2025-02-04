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
public class GeneratedAddProperty_ExistingPath_ThrowsException {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_ExistingPath_ThrowsException() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.path");
        when(builder.getRootEntries()).thenReturn(new LinkedHashMap<>());
        when(builder.getChildMap(any(), anyString())).thenReturn(new LinkedHashMap<>());
        when(builder.getChildMap(any(), "test.path")).thenReturn(new LinkedHashMap<>());
        when(builder.getChildMap(any(), "test.path").containsKey("test.path")).thenReturn(true);
        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

}