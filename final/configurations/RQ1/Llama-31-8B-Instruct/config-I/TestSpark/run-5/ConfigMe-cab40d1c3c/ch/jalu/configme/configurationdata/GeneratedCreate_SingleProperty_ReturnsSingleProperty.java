package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.exception.ConfigMeException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_SingleProperty_ReturnsSingleProperty {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void create_SingleProperty_ReturnsSingleProperty() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.path");
        builder.add(property);
        List<Property<?>> result = builder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}