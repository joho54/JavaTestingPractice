import javax.naming.spi.DirStateFactory;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CrudeTrackerTest {
    private static CrudeTracker crudeTracker;
    private  static CrudeInfo crudeInfo1 = new CrudeInfo(1, 100, 10000);
    private  static CrudeInfo crudeInfo2 = new CrudeInfo(2, 200, 20000);
    private static ArrayList<CrudeInfo> oil_list = new ArrayList<>(Arrays.asList(crudeInfo1, crudeInfo2));


    @BeforeEach
    void setUp(){
        crudeTracker = new CrudeTracker();
        crudeTracker.crudeInfos.put(crudeInfo1.Idx, crudeInfo1);
        crudeTracker.crudeInfos.put(crudeInfo2.Idx, crudeInfo2);
    }
    
    @Test
    @DisplayName("Find by Id Test")
    void testFindByID(){
        CrudeInfo result = crudeTracker.findOil(1);
        assertEquals(crudeInfo1, result);
    }

    @Test
    @DisplayName("Get Price by Id")
    void testFindPriceByID(){
        Integer resultPrice = crudeTracker.getOilPriceById(1);
        assertEquals(crudeInfo1.Price, resultPrice);
    }

    @Test
    @DisplayName("Get all Oils")
    void testGetAllOils(){
        ArrayList<CrudeInfo> result_oilinfos = crudeTracker.getAllOils();
        assertEquals(oil_list, result_oilinfos);
    }
}
