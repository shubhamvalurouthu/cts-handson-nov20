import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestMap {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("EC", Arrays.asList("STUDENT1", "STUDENT3"));
		map.put("CS", Arrays.asList("STUDENT2","STUDENT4"));
		System.out.println(map);

	}

}
