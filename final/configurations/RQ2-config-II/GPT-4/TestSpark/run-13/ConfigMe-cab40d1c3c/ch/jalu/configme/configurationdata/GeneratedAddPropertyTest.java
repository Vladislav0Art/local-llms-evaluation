package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("root.key");

        // Add property
        builder.add(property);

        // Verify
        assertTrue(builder.getRootEntries().containsKey("root.key"));
    }

}