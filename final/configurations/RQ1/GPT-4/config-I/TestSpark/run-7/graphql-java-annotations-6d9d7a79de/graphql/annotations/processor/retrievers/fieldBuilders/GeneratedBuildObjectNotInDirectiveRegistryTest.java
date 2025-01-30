package graphql.annotations.processor.retrievers.fieldBuilders;

import static graphql.schema.GraphQLArgument.newArgument;
import static graphql.schema.GraphQLScalarType.newScalar;
import static graphql.schema.GraphQLDirective.newDirective;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.annotation.Annotation;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBuildObjectNotInDirectiveRegistryTest {

    @Test
    public void buildObjectNotInDirectiveRegistryTest() {
        AnnotatedElement annotatedElementMock = mock(AnnotatedElement.class);
        ProcessingElementsContainer containerMock = mock(ProcessingElementsContainer.class);
        Annotation annotationMock = mock(Annotation.class);
        Annotation[] annotations = new Annotation[]{annotationMock};
        when(containerMock.getDirectiveRegistry()).thenReturn(new HashMap<>());
        when(annotatedElementMock.getAnnotations()).thenReturn(annotations);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElementMock, containerMock);

        directivesBuilder.build();
    }

}