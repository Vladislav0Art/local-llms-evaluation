package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedCreateEmptyPropertiesTest {

    @Test
    public void createEmptyPropertiesTest() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        List < Optional < Property ?>>properties = new ArrayList<>();
        try {
            builder.createOptionalProperties(properties.get(0));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
    }

}