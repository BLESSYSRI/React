package basics;

	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.util.HashMap;
	import java.util.Map;

	public class JObject {
	    public static void main(String[] args) throws Exception {
	        // Create a new map to hold key-value pairs
	        Map<String, Object> jsonObject = new HashMap<>();

	        // Add some data to the map
	        jsonObject.put("name", "John");
	        jsonObject.put("age", 25);
	        jsonObject.put("isMarried", false);

	        // Create an ObjectMapper to convert the map to JSON string
	        ObjectMapper objectMapper = new ObjectMapper();

	        // Convert the map to a JSON string
	        String jsonString = objectMapper.writeValueAsString(jsonObject);

	        // Print the JSON string
	        System.out.println(jsonString);
	    }
	}

