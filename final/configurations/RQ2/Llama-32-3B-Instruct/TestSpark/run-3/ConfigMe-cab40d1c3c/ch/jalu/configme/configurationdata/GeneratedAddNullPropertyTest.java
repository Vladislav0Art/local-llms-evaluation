package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        Optional<Property<?>> property = Mockito.mock(Property.class);
        Mockito.when(property.get()).thenReturn(null);
        try {
            builder.add(property.get());
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
    }

}