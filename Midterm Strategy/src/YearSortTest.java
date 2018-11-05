import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class YearSortTest {

    YearSort testObject = new YearSort();
    
    @Test
    void testSort() {
        var testValues = new ArrayList<BookInformation>();
        for (int i = 2; i >= 0; i--)
            testValues.add(new BookInformation("", i, "", ""));
        
        var output = testObject.sort(testValues);
        for (int i = 0; i < 3; i++)
            assertEquals(i, output.get(i).getYearPublished());
    }

}
