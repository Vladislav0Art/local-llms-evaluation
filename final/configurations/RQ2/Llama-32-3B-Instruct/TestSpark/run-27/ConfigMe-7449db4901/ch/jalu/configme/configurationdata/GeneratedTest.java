package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    private SettingsHolder settingsHolder;

    @Before
    public void setup() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("key2", "value2");

        settingsHolder = new SettingsHolder();
        settingsHolder.init();
        settingsHolder.setMap(map);
        settingsHolder.setResultMap(resultMap);
    }

}