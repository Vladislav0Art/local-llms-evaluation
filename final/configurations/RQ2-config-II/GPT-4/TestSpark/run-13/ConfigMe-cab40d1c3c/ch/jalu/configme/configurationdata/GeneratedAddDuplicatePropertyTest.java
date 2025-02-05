package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("root.key");

        // Add the same property twice
        builder.add(property);
        builder.add(property);
    }

}