class Count {
    int wordOccurrence;

    //getter and setter methods
    public int getWordOccurrence() {
        return wordOccurrence;
    }

    public void setWordOccurrence(String word,String str) {
        wordOccurrence = findWordOccurrence(word,str);
    }

    public int findWordOccurrence(String word,String str)
    {
        String[] a = str.split(" ");
        // search for pattern in a
        int count = 0;
        for (String s : a) {
            // if match found increase count
            if (word.equals(s))
                count++;
        }

        return count;
    }
}
