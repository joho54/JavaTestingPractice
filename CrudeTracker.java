import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CrudeTracker {
    public static HashMap<Integer, CrudeInfo> crudeInfos =  new HashMap<>();
    
    public static CrudeInfo findOil(int Idx){
        CrudeInfo crudeInfo = crudeInfos.get(Idx);
        return crudeInfo;
    }

    public static ArrayList getAllOils(){
        Collection<CrudeInfo> values = crudeInfos.values();
        return new ArrayList<>(values);
    }

    public static Integer getOilPriceById(int Idx){
        Integer price = crudeInfos.get(Idx).Price;
        return price;
    }
}
