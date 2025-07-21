import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.BigInteger;
public class GroupAnagaram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagaram obj = new GroupAnagaram();

        List<List<String>> grouped = obj.groupAnagrams(input);

        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        int[] nos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,87,97,101,103};
        Map<BigInteger , List<String>> map = new HashMap<>();
        for(String words : strs){
            BigInteger prod = BigInteger.ONE;
            for(int i = 0;i < words.length();i++){
                prod = prod.multiply(BigInteger.valueOf(nos[words.charAt(i) - 'a']));
            }
            if(map.containsKey(prod)){
                map.get(prod).add(words);
            }
            else{
                map.put(prod,new ArrayList<String>());
                map.get(prod).add(words);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for(List<String> val : map.values()){
            result.add(val);
        }
        return result;
    }
}
/*List<List<String>> result = new ArrayList<List<String>>();
for(List<String> val : map.values()){
    result.add(val);
}
return result;

OR

return new ArrayList<>(map.values());
*/
