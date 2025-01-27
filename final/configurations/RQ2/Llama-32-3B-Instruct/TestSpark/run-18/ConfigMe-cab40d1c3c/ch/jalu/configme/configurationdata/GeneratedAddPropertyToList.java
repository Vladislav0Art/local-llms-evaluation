package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyToList {

    @Test
    public void addPropertyToList() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        builder.add(property);
        assertEquals(1, list.size());
        assertTrue(list.contains(property));
    }

}