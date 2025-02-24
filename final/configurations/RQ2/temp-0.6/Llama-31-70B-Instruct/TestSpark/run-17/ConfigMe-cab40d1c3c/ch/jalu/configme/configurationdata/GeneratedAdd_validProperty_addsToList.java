package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedAdd_validProperty_addsToList {

    @Test
    public void add_validProperty_addsToList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");

        builder.add(property);
        Map<String, Object> rootEntries = builder.getRootEntries();

        assertEquals(1, rootEntries.size());
        assertNotNull(rootEntries.get("test"));
    }

}