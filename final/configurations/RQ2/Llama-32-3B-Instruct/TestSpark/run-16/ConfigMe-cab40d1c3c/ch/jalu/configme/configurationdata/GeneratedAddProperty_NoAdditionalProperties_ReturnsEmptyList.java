package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_NoAdditionalProperties_ReturnsEmptyList {

    @Test
    public void addProperty_NoAdditionalProperties_ReturnsEmptyList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when:
        List<Property<?>> properties = builder.addProperty(new Property<>("a", "b"));

        // then:
        assertEquals(1, properties.size());
    }

}