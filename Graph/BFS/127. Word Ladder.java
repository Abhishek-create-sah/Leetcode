class Solution {
    public int ladderLength(String begw, String endw, List<String> wl) {
        Set<String> dict = new HashSet<>(wl);
        if(!dict.contains(endw)) return 0 ;

        Queue<String> q = new LinkedList<>();
        q.add(begw);

        int level = 1 ;

        while(!q.isEmpty()){
            int s = q.size() ;

            for(int i = 0 ; i < s ; i++){
                String cur = q.poll();
                if(cur.equals(endw)) return level ;
                char[] chars = cur.toCharArray() ;
                for(int j = 0 ; j < chars.length ; j++){
                    char temp = chars[j] ;
                    for(char c = 'a' ; c <= 'z' ; c++){
                        chars[j] = c ;
                        String nextw = new String(chars);

                        if(dict.contains(nextw)){
                            q.add(nextw);
                            dict.remove(nextw);
                        }
                    }
                    chars[j] = temp ;
                }
            }
            level++ ;
        }
        return 0 ;
    }
}
