package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuildTestDirectiveNotFound {

    @Test
    public void buildTestDirectiveNotFound() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        container.setDirectiveRegistry(new HashMap<>());
        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}