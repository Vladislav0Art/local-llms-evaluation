package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedAddEmptyPropertyTest {

    @Test
    public void addEmptyPropertyTest() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        Optional<Property<?>> property = Mockito.mock(Property.class);
        try {
            builder.add(property.get());
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
    }

}