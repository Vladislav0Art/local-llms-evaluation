package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_AdditionalProperties_ReturnsCorrectlyFormedList {

    @Test
    public void addProperty_AdditionalProperties_ReturnsCorrectlyFormedList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        Property<?> p1 = new Property<>("a", "b");
        Property<?> p2 = new Property<>("c", "d");

        // when:
        Properties ps = builder.addProperties(p1, p2);

        // then:
        assertEquals(2, ps.size());
    }

}