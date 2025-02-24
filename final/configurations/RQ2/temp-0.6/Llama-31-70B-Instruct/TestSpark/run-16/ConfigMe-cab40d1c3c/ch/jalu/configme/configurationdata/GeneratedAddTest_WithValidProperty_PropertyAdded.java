package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTest_WithValidProperty_PropertyAdded {

    @Test
    public void addTest_WithValidProperty_PropertyAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Property<?> property = new Property<>(String.class, "key", "default");
        builder.add(property);

        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertTrue(properties.contains(property));
    }

}