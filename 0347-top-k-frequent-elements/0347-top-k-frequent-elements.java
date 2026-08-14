class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue()); // min-heap

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll(); // remove smallest, keeping only top k
            }
        }

        int[] res = new int[k];

        for(int i=0; i<k; i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[i] = entry.getKey();
        }
        return res;
    }
}