package org.traccar.protocol;

public class GeneratedTest {

    public String build(LocalDateTime date) {
        return date.toString();
    }
}

public class Network {
    private String timestamp;

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

public class Parser {
    public static Network parse(Map<String, String> data) {
        Network network = new Network();
        network.setTimestamp(data.get("timestamp"));
        return network;
    }
}

public class GeneratedTest {

    @Test
    public void testGenerateClassAndMethod() {
        DateBuilder dateBuilder = new DateBuilder();
        String timestamp = dateBuilder.build(LocalDateTime.now());

        Map<String, String> data = new HashMap<>();
        data.put("timestamp", timestamp);

        Network network = Parser.parse(data);

        System.out.println(network.getTimestamp());
    }

}