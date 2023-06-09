package HW2;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class task1 {
    public static void main(String[] args) {
        int[] indexToUse = {3,2,1};
        String s = "cba";
        
        String result = shuffleString(s, indexToUse);
        System.out.println(result);
        
    }

    public static String shuffleString(final String s, final int[] indexToUse){
        char[] chars = s.toCharArray();
        char[] shuffledChars = new char[chars.length];
        for (int i = 0; i < indexToUse.length;i++){
            int index = indexToUse[i] - 1;
            shuffledChars[index] = chars[i];
        }

        String shuffledStr = shuffledChars.toString();
        return (shuffledStr);
    }

}