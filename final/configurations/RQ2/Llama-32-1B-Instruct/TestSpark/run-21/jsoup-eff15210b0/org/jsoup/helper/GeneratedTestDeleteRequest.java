package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestDeleteRequest {

    @Test
    public void testDeleteRequest() {
        Request request = new Request();
        request.add(new Method("DELETE", "http://example.com"));
        System.out.println(request.getEndpoint());
    }
}

public class Response {
    private String endpoint;

    public Response(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return endpoint.equals(response.endpoint);
    }
}

public class Method {
    private String name;

    public Method(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Method method = (Method) o;
        return name.equals(method.name);
    }
}

public class Request {
    private ArrayList<Method> methods;

    public void add(Method method) {
        this.methods.add(method);
    }

    public String getEndpoint() {
        StringBuilder sb = new StringBuilder();
        for (Method method : methods) {
            sb.append(method.name).append(" ").append(method.type).append("\n");
        }
        return sb.toString().trim();
    }
}

public class ArrayList {
    private Object[] array;

    public ArrayList(Object... array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayList arrayList = (ArrayList) o;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(arraylist.array[i])) return false;
        }
        return true;
    }

    public Object[] getArray() {
        return array;
    }
}

public class Method {
    private String name;

    public Method(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Method method = (Method) o;
        return name.equals(method.name);
    }
}

public class Request {
    private ArrayList<Method> methods;

    public void add(Method method) {
        this.methods.add(method);
    }

    public String getEndpoint() {
        StringBuilder sb = new StringBuilder();
        for (Method method : methods) {
            sb.append(method.name).append(" ").append(method.type).append("\n");
        }
        return sb.toString().trim();
    }

}