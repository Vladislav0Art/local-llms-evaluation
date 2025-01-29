package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito.*;

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.add("property1");
        assertNotNull(result);
    }

}