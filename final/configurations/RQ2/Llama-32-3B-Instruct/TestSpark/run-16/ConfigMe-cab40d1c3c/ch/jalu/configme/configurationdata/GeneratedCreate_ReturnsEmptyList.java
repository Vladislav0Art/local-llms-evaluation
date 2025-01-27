package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_ReturnsEmptyList {

    @Test
    public void create_ReturnsEmptyList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when:
        List<Property<?>> properties = builder.createProperties();

        // then:
        assertTrue(properties.isEmpty());
    }

}