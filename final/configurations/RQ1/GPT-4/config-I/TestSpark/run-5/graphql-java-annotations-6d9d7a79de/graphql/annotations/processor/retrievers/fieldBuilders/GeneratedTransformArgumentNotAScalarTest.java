package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTransformArgumentNotAScalarTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private GraphQLDirective.Builder directiveBuilder;

    @Mock
    private GraphQLDirective directive;

    @Mock
    private GraphQLArgument argument;

    @Mock
    private Coercing coercing;

    @Test
    public void transformArgumentNotAScalarTest() throws Exception {
        Annotation annotation = new DummyDirectiveAnnotation();
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);

        List<GraphQLArgument> argumentList = new ArrayList<>();
        argumentList.add(argument);

        builder.transformArgument(annotation, directiveBuilder, argumentList, 0);
    }

    private @interface DummyDirectiveAnnotation {
        String name() default "dummy";
    }

}