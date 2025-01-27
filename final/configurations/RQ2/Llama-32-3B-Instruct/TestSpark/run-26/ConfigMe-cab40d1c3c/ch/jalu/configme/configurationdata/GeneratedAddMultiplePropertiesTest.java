package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddMultiplePropertiesTest {

    @Test
    public void addMultiplePropertiesTest() {
        Property property1 = Mockito.mock(Property.class);
        Property property2 = Mockito.mock(Property.class);
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        builder.add(property1);
        builder.add(property2);
        assertEquals(2, builder.create().size());
    }

}