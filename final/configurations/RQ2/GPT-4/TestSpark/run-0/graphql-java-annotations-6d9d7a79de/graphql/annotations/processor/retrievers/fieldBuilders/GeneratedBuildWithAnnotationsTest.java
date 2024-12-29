package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedBuildWithAnnotationsTest {

    @Test
    public void buildWithAnnotationsTest() throws Exception {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Set<Annotation> annotations = new HashSet<>(Arrays.asList(Field.class.getDeclaredAnnotations()));
        annotations.add(Mockito.mock(Annotation.class));

        Mockito.when(container.getAnnotations()).thenReturn(annotations);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(Field.class, container);
        directivesBuilder.build();
    }

}