package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddOnePropertyTest {

    @Test
    public void addOnePropertyTest() {
        Property property = Mockito.mock(Property.class);
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        builder.add(property);
        assertEquals(1, builder.create().size());
    }

}