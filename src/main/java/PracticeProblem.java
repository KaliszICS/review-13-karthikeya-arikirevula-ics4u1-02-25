import java.util.ArrayList;
import java.util.HashMap;;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> swap(ArrayList<String> lists, int nums, int num2) {
		if (nums >= 0 && num2 >= 0 && nums < lists.size() && num2 < lists.size()) {
			String tempString = lists.get(nums);
			lists.set(nums, lists.get(num2));
			lists.set(num2, tempString);
		}
		return lists;
	}

	public static ArrayList<Double> createArrayList(double[] secondArray) {
		ArrayList<Double> secondList = new ArrayList<>();

		for (int i = 0; i < secondArray.length; i++) {
			secondList.add(secondArray[i]);
		}
		return secondList;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] name, int[] age) {
		HashMap<String, Integer> dora = new HashMap<>();

		for (int i = 0; i < name.length; i++) {
			dora.put(name[i], age[i]);
		}

		return dora;
	}

	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> dora, String name) {
		if (dora.containsKey(name)) {
			dora.put(name, dora.get(name) + 1);
		}

		return dora;
	}
}

