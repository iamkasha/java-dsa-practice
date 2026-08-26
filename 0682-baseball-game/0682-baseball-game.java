class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for(String op : operations){

            if("+".equals(op)){
                int cur = stack.removeLast();
                int prev = stack.peekLast();
                stack.addLast(cur);
                stack.addLast(cur + prev);
            } else if("D".equals(op)){
                int prev = stack.peekLast();
                stack.addLast(2 * prev);
            } else if("C".equals(op)){
                stack.removeLast();
            } else {
                stack.addLast(Integer.parseInt(op));
            }

        }

        int totalSum = 0;

        while(!stack.isEmpty()){
            totalSum += stack.removeLast();
        }
        
        return totalSum;
    }
}