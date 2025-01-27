package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_emptyListTest {

    @Test
    public void create_emptyListTest() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(properties);
        assertTrue(result.isEmpty());
    }

}