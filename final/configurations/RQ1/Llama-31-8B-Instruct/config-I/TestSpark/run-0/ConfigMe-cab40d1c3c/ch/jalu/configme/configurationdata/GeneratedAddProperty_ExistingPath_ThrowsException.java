package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.exception.ConfigMeException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_ExistingPath_ThrowsException {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void addProperty_ExistingPath_ThrowsException() {
        Property<String> property = new Property<>("test.path", "value");
        when(builder.getRootEntries()).thenReturn(new java.util.LinkedHashMap<>());
        when(builder.getChildMap(any(), "test.path")).thenReturn(new java.util.LinkedHashMap<>());
        when(builder.getChildMap(any(), "test.path").containsKey("test.path")).thenReturn(true);
        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

}