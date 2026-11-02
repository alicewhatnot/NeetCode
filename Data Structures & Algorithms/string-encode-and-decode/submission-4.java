class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> stringList = new ArrayList<String>();

        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimiter));
            int start = delimiter + 1;
            stringList.add(str.substring(start, start + len));
            i = start + len;
        }
                
        return stringList;
    }
}
