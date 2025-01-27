package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedCreatePropertiesTest {

    @Test
    public void createPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        builder.add(properties.get(0));
        List < Optional < Property ?>>result = builder.createOptionalProperties();
        assertTrue(result.contains(properties.get(0)));
    }

}