public class reversal {

    public reversal(String s) {
    String str = s;
    int length = 0;
    String[] letters = {"A","A","A","A","A","A","A","A","A","A","A","A","A",};
    String[] reverseLetters = {"A","A","A","A","A","A","A","A","A","A","A","A","A",};
        
    for(int i = 0; i < str.length(); i++) {
            String string = String.valueOf(str.charAt(i));
            letters[i] = string;
            length++;
    }
    
    int x = length;

    for(int i = 0; i < length+1; i++) {
            
        String let = letters[x];
        reverseLetters[i] = let;
        x--;

    }

    for(int i = 0; i < length; i++) {
        System.out.println(reverseLetters[i+1]);
    }
}
}
    