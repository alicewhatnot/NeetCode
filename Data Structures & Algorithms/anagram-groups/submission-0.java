class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key: sorted string
        // value: index
        HashMap<String, Integer> anagramIndex = new HashMap<>();
        List<List<String>> anagramList = new ArrayList<List<String>>();

        String sortedString;
        Integer outputIndex = -1;
        Integer position;

        for (int i = 0; i < strs.length; i++) {
            List<String> innerList = new ArrayList<String>();

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            sortedString = new String(chars);
                        

            position = anagramIndex.get(sortedString);
            if (position != null) {
                anagramList.get(position).add(strs[i]);
            } else {
                outputIndex ++;
                innerList.add(strs[i]);
                anagramList.add(innerList);
                anagramIndex.put(sortedString,outputIndex);
            }
            
        }

        return anagramList;
    }
}

