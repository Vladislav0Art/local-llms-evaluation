package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreateFilledListTest {

    @Test
    public void createFilledListTest() {
        Property mockProperty = mock(Property.class);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);
        List<Property<?>> propertyList = builder.create();
        assertEquals(1, propertyList.size());
    }

}