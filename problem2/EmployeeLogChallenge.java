package problem2;
import java.util.*;

public class EmployeeLogChallenge {
public static void main(String[] args) {
	String[] employeeNames = {
		    "Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve",
		    "Charlie", "Alice", "Frank", "Grace", "Bob"
		};

	List<String>employeeList= new ArrayList<>();
	for(String name :employeeNames) {
		employeeList.add(name);
	}
	System.out.println("Task1:Store and Display All Entries");
	System.out.println("Totatal Entries:"+employeeList.size());
	System.out.println("All Employee Entries"+employeeList);
	System.out.println("-----------------------------------------------");
	
//	task 2
	Set<String>uniqueEmployees= new HashSet<>(employeeList);
	System.out.println("Task2:Identify Unique Employees");
	System.out.println("Unique Employees"+uniqueEmployees.size());
	System.out.println("Employees Name"+uniqueEmployees);
	System.out.println("-----------------------------------------------");
	
//	Task3
	Map<String,Integer>frequencyMap=new HashMap<>();
	for(String name: employeeList) {
		if(frequencyMap.containsKey(name)) {
			frequencyMap.put(name, frequencyMap.get(name)+1);
		}else {
			frequencyMap.put(name, 1);
		}
	}
	System.out.println("Task 3: count Entry Frequency");
	for(Map.Entry<String, Integer> entry:frequencyMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}
}
