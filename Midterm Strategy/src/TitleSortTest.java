import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TitleSortTest {

    TitleSort testObject = new TitleSort();
    
    @Test
    void testSort() {
        var testValues = new ArrayList<BookInformation>();
        String testNames[] = {"a", "b", "c"};
        for (int i = 2; i >= 0; i--)
            testValues.add(new BookInformation("", 0, testNames[i], ""));
        
        var output = testObject.sort(testValues);

        for (int i = 0; i < 3; i++)
            assertEquals(testNames[i], output.get(i).getTitle());
    }
}
