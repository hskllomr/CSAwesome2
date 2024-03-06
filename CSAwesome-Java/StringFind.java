public class StringFind
{
    /**
     * findLetter looks for a letter in a String
     *
     * @param String letter to look for
     * @param String text to look in
     * @return boolean true if letter is in text After running the code, change
     *     this method to return an int count of how many times letter is in the
     *     text.
     */
    public int findLetter(String letter, String text)
    {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.substring(i, i + 1).equalsIgnoreCase(letter))
            {
                count=count+1;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        StringFind test = new StringFind();
        String message = "Apples and Oranges";
        String letter = "p";
        System.out.println("Does " + message + " contain a " + letter + "?");
        System.out.println(test.findLetter(letter, message));
    }
}
