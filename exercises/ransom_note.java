class ransom_note {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map freq = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int count = freq.containsKey(c) ? freq.get(c) : 0;
            freq.put(c, count + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = freq.containsKey(c) ? freq.get(c) : 0;
            if (count == 0) {
                return false;
            }
            if (count == 1) {
                freq.remove(c);
            } else {
                freq.put(c, count - 1);
            }
        }
        return true;
    }

}
