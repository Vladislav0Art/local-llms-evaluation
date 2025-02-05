package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildInvalidDirectiveAnnotationTest {

    @Test
    public void buildInvalidDirectiveAnnotationTest() {
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{Mockito.mock(Annotation.class)});
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectiveJavaAnnotationUtil directiveUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        Mockito.when(container.getDirectiveJavaAnnotationUtil()).thenReturn(directiveUtil);
        Mockito.when(directiveUtil.getGraphQLDirective(Mockito.any(), Mockito.any())).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}