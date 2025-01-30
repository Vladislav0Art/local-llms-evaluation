package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.methodBuilders.method.DirectiveAndWiring;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedTransformArgsTooManyArgumentsTest {

    @Test
    public void transformArgsTooManyArgumentsTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        GraphQLDirective graphQLDirective = new GraphQLDirective("name", "description", null);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.transformArgs(graphQLDirective, new String[]{"arg1", "arg2", "arg3", "arg4"});
    }

}