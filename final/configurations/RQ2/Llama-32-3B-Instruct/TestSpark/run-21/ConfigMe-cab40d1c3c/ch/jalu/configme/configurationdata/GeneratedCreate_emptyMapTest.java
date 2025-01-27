package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_emptyMapTest {

    @Test
    public void create_emptyMapTest() {
        Map<String, Object> map = Collections.emptyMap();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(map);
        assertTrue(result.isEmpty());
    }

}