package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddNoPropertiesTest {

    @Test
    public void addNoPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        assertTrue(builder.add(null) == null);
    }

}