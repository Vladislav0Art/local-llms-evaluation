package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedCreateNonEmptyListTest {

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(mockProperty, properties.get(0));
    }

}