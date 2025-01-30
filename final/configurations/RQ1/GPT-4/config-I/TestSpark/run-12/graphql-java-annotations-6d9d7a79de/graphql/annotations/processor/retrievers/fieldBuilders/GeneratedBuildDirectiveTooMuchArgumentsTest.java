package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectiveTooMuchArgumentsTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private GraphQLScalarType scalarType;

    @Test
    public void buildDirectiveTooMuchArgumentsTest() {
        GraphQLDirective directive = GraphQLDirective.newDirective().name("dirName").build();
        DirectivesBuilder builder = new DirectivesBuilder(MyClass3.class, container);

        Map<String, GraphQLDirective> registry = new HashMap<>();
        registry.put("dirName", directive);
        when(container.getDirectiveRegistry()).thenReturn(registry);

        Exception exception = assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
        assertEquals("Directive 'dirName' is supplied with more argument values than it supports", exception.getMessage());
    }
}

class MyClass1 {
}

class MyClass2 {
    @DirectiveAnnotationName
    String getMyValue() {
        return "myvalue";
    }
}

class MyClass3 {
    @DirectiveAnnotationName
    String getMyValue1() {
        return "value1";
    }

    @DirectiveAnnotationName
    String getMyValue2() {
        return "value2";
    }

}