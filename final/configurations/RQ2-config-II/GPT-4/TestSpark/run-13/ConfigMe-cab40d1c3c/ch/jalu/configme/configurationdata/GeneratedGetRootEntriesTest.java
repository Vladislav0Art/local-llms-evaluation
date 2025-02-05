package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = Mockito.mock(Property.class);
        Mockito.when(property1.getPath()).thenReturn("root.key1");
        builder.add(property1);
        Property<String> property2 = Mockito.mock(Property.class);
        Mockito.when(property2.getPath()).thenReturn("root.key2");
        builder.add(property2);

        // Verify
        assertEquals(2, builder.getRootEntries().size());
        assertTrue(builder.getRootEntries().containsKey("root.key1"));
        assertTrue(builder.getRootEntries().containsKey("root.key2"));
    }

}