package ch.jalu.configme.configurationdata;

public class GeneratedTest2 {

    @Test
    public void test2() throws ConfigMeException {
        Map<String, Object> map = new LinkedHashMap<>();
        Property p3 = new Property("c", 3);
        Property p4 = new Property("d", 4);
        builder.add(p3);
        builder.add(p4);
        map.put("c", 3);
        map.put("d", 4);
    }

}