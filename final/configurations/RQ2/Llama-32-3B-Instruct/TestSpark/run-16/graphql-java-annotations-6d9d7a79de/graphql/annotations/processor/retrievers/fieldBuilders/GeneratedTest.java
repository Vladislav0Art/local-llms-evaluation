package graphql.annotations.processor.retrievers.fieldBuilders;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    public String getRequiredField(Object object, String name) throws Exception {
        return (String) ((Method) Method.class.cast(object.getClass().getMethod(name))).invoke(null);
    }

    public void build(DirectiveMock directivesMock, String directiveName, List<DirectiveMock> mockList) {
        mockList.add(directivesMock);
    }
}

public class DirectiveMock {

    public static class GraphQLDirective {
    }

    public static final String DIRECTIVE_NAME = "";

}